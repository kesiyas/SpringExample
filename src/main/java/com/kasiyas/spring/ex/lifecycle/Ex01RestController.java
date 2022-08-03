package com.kasiyas.spring.ex.lifecycle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kasiyas.spring.ex.lifecycle.model.Person;

@RestController // @Controller + @ResponseBody
public class Ex01RestController {

	@RequestMapping("/lifecycle/ex01/3")
	public String strResponse() {
		return "RestController 테스트!!";
	}
	
	// 직접 만든 클래스의 객체 return
	@RequestMapping("/lifecycle/ex01/4")
	public Person objectResponse() {
		Person person = new Person();
		person.setName("최인섭");
		person.setAge(10);
		
		return person;
	}
	
	// entity - http status code 포함
	@RequestMapping("/lifecycle/ex01/5")
	public ResponseEntity<Person> entityResponse() {
		Person person = new Person();
		person.setName("최인섭");
		person.setAge(10);
		
		// Status - 200 OK
		// 500 - Internal server error
		ResponseEntity<Person> entity = new ResponseEntity(person, HttpStatus.INTERNAL_SERVER_ERROR);
		return entity;
	}
	
	
	
	
}
