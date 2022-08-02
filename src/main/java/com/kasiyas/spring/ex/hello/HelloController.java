package com.kasiyas.spring.ex.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	
	@ResponseBody // 리턴 타입에 맞춰서 브라우저에 전달
	@RequestMapping("/helloWorld")
	public String helloWorld () {
		
		return "hello World";
		
	}
	
	
}
