package com.kasiyas.spring.ex.ajax;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kasiyas.spring.ex.ajax.bo.NewUserBO;
import com.kasiyas.spring.ex.jsp.model.User;

@Controller
@RequestMapping("/ajax/user")
public class UserContorller {

	@Autowired
	NewUserBO newUserBO;
	
	@GetMapping("/list")
	public String userList(Model model) {
		
		List<User> userList = newUserBO.getUserList();
		
		model.addAttribute("userList", userList);
		
		return "ajax/userList";
	}
	
	@GetMapping("/input")
	public String userInput() {
		
		return "ajax/userInput";
	}
	
	@GetMapping("/add")
	@ResponseBody
	public Map<String, String> addUser(
			@RequestParam("name") String name
			, @RequestParam("birthDay") String birthDay
			, @RequestParam("email") String email) {
		
		int count = newUserBO.addUser(name, birthDay, email);
		
		// 성공 시 : {"result":"success"}
		// 실패 시 : {"result":"fail"}
		
		Map<String, String> map = new HashMap<>();
		
		if(count == 1) {
			map.put("result", "success");
		} else {
			map.put("result", "fail");
		}
		
		return map;
	}
	
	
	// api
	// email 중복 여부를 알려주는 api
	@GetMapping("/is_duplicate")
	public Map<String, Boolean> isDuplicate(@RequestParam("email") String email) {
		
		boolean isDuplicate = newUserBO.isDuplicateEmail(email);
		// {"isDuplicate":true} or {"isDuplicate":false}
		Map<String, Boolean> map = new HashMap<>();
		
		if(isDuplicate) {
			map.put("is_duplicate", true);
		} else {
			map.put("is_duplicate", false);			
		}
		
		return map;
	}
		
}
