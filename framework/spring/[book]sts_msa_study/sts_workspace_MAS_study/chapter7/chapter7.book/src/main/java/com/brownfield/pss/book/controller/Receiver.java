package com.brownfield.pss.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

import com.brownfield.pss.book.component.BookingComponent;
import com.brownfield.pss.book.component.BookingStatus;

@EnableBinding(BookingSink.class)
@Component
public class Receiver {

    public Receiver() {
    }

    /*
     * BookingComponent bookingComponent;
     * 
     * @Autowired public Receiver(BookingComponent bookingComponent){
     * this.bookingComponent = bookingComponent; }
     * 
     * @RabbitListener(queues = "CheckINQ") public void processMessage(long
     * bookingID ) { System.out.println(bookingID);
     * bookingComponent.updateStatus(BookingStatus.CHECKED_IN, bookingID); }
     */
    @Autowired
    BookingComponent bookingComponent;

    @ServiceActivator(inputChannel = BookingSink.CHECKINQ)
    public void accept(long bookingID) {
        bookingComponent.updateStatus(BookingStatus.CHECKED_IN, bookingID);
    }
}

interface BookingSink {
    public static String CHECKINQ = "checkInQ";

    @Input("checkInQ")
    public MessageChannel inventoryQ();
}