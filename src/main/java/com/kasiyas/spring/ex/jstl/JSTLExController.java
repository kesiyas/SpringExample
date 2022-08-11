package com.kasiyas.spring.ex.jstl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jstl")
public class JSTLExController {

	@GetMapping("/ex01")
	public String jstlEx01() {		
		
		return "jstl/ex01";
	}
	
	@GetMapping("/ex02")
	public String jstlEx02(Model model) {
		
		model.addAttribute("weight", 75);
		
		List<String> fruitList = new ArrayList<>();
		fruitList.add("사과");
		fruitList.add("메론");
		fruitList.add("포도");
		
		model.addAttribute("fruitList", fruitList);
		
		// List<Map>
		// 사용자 정보 Map
		List<Map<String, Object>> userList = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		map.put("name", "최인섭");
		map.put("age", 25);
		map.put("hobby", "댄스");
		userList.add(map);	
		
		map = new HashMap<>();
		map.put("name", "김바다");
		map.put("age", 29);
		map.put("hobby", "사냥하기");
		userList.add(map);
		
		model.addAttribute("userList", userList);
		
		return "jstl/ex02";
	}
	
}
