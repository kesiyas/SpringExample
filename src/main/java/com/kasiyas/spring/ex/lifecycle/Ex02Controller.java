package com.kasiyas.spring.ex.lifecycle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Ex02Controller {

	@RequestMapping("/lifecycle/ex02/1")
	public String ex02View() {
		
		return "lifecycle/ex02"; // 자바 내부에서 접근하는 경로, 위 경로와는 상관 없음
		
	}
	
}
