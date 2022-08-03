package com.kasiyas.spring.ex.lifecycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/lifecycle/ex01/")
public class Ex01Controller {

	// 문자열 Response 만들기
	@RequestMapping("/1")
	@ResponseBody
	public String strResponse(){
		return "예제 1번 문자열 담는 Response";
	}
	
	// map json response
	// 과일이름 : 가격
	@ResponseBody
	@RequestMapping("/2")
	public Map<String, Integer> mapResponse() {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("apple", 1500);
		map.put("banana", 2500);
		map.put("orange", 2000);
		
		return map;
	}
	
	
	
}
