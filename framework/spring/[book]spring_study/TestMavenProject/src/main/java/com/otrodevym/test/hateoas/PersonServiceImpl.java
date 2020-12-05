package com.otrodevym.test.hateoas;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service()
public class PersonServiceImpl implements PersonService{

	@Override
	public Person getPersonDetail(String personId) {
		return new Person(1, "kim1", "서울");
	}
	@Override
	public ArrayList<Person> getPersonList(String personId){
		ArrayList<Person> list = new ArrayList<Person>();
		
		list.add(new Person(1, "kim1", "서울"));
		list.add(new Person(2, "kim2", "경기"));
		list.add(new Person(3, "kim3", "세종"));
		list.add(new Person(4, "kim4", "부산"));
		list.add(new Person(5, "kim5", "대전"));
		return list;
	}
	

}
