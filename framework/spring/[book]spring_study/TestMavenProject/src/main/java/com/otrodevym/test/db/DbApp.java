package com.otrodevym.test.db;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DbApp {
	private static EntityManager manager;
	
	public static void main(String args[]) {
//		ApplicationContext ac = new ClassPathXmlApplicationContext("dbbean.xml");
		ApplicationContext ac = new AnnotationConfigApplicationContext(SampleEntityConfig.class);
		
		EntityManagerFactory factory = ac.getBean(EntityManagerFactory.class);
		manager = factory.createEntityManager();
		
		SampleEntityRepository repository = ac.getBean(SampleEntityRepository.class);
		
		makeDummyData();
		
//		updateEntity("1");

//		deleteEntity("2");
		
//		Query query = manager.createQuery("from SampleEntity");
//		List list = query.getResultList();
		List list = repository.findAll();
		printList(list);
		
		List list1 = repository.findByNameLike("%ki%");
		System.out.println("find by name");
		printList(list1);
		List list2 = repository.findByMailEndingWith(".com");
		System.out.println("find by mail");
		printList(list2);
		
		
	}
	
	public static void makeDummyData() {
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(new SampleEntity("kim", "kim@naver.com"));
		manager.persist(new SampleEntity("park", "pack@daum.net"));
		manager.persist(new SampleEntity("han", "han@gaml.com"));
		manager.flush();
		transaction.commit();
	}
	
	
	public static void printList(List list) {
		for(Object item : list) {
			System.out.println(item);
		}
	}
	public static void updateEntity(String id) {
		SampleEntity entity = manager.find(SampleEntity.class, id);
		entity.setName("name");
		entity.setMail("name@mail.com");
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.merge(entity);
		manager.flush();
		transaction.commit();
	}
	
	public static void deleteEntity(String id) {
		SampleEntity entity = manager.find(SampleEntity.class, id);
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		manager.remove(entity);
		manager.flush();
		transaction.commit();
	}
	
}
