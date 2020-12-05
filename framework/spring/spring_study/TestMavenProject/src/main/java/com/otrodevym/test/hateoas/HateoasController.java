package com.otrodevym.test.hateoas;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/* 2018.12.18 otrodevym : spring mvaen project에서 구동을 못하여 spring mvc project에서 구동했습니다.
*/
@RestController
@RequestMapping(value = "/hateoas")
public class HateoasController {

	@Autowired
	private PersonService service;

	@GetMapping(value = "/{personId}")
	public ResponseEntity<Person> getPersonById(@PathVariable String personId) {
		Person person = service.getPersonDetail(personId);
		Link link = new Link("http://localhost:8080/spring-hateoas-test");
		Link self = linkTo(HateoasController.class).slash(person.getPersonId()).withSelfRel();
		Link job = linkTo(HateoasController.class).slash(person.getPersonId()).withRel("job");
		Link home = linkTo(HateoasController.class).slash(person.getPersonId()).withRel("home");
		person.add(link);
		person.add(self);
		person.add(job);
		person.add(home);
		System.out.println(person);
		return new ResponseEntity<Person>(person, HttpStatus.OK);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ArrayList<Person> getPersonList(@PathVariable String personId) {
		ArrayList<Person> list = service.getPersonList(personId);
		Link link = new Link("http://localhost:8080/spring-hateoas-test");
		for(final Person person : list) {
			Link selfLink = linkTo(methodOn(HateoasController.class)).withSelfRel();
			person.add(selfLink);
		}
		System.out.println(list);
		return list;
	}
}
