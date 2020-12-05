package com.otrodevym.test.hateoas;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

public interface PersonService {
	public Person getPersonDetail(String personId);
	public ArrayList<Person> getPersonList(String personId);
}
