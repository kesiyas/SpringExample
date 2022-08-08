package com.kasiyas.spring.ex.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kasiyas.spring.ex.jsp.bo.UserBO;
import com.kasiyas.spring.ex.jsp.model.User;

@Controller
@RequestMapping("/jsp/user")
public class UserController {
	
	@Autowired
	private UserBO userBO;

	// new_user 데이터 저장
	// 이름, 생년 월일, 자기 소개, 이메일
//	@RequestMapping("/add")
//	@RequestMapping(path="/add", method=RequestMethod.POST)
	@PostMapping("/add")
	@ResponseBody
	public String addUser(
		@RequestParam("name") String name
		, @RequestParam("birthDay") String birthDay
		, @RequestParam("introduce") String introduce
		, @RequestParam("email") String email )
	{
		
		int count = userBO.addUser(name, birthDay, introduce, email);
		
		return "수행 결과 : " + count;
	}
	
	@RequestMapping("/input")
	public String userInput() {	
		return "jsp/userInput";
	}
	
	// 가장 최근에 등록된 사용자 정보를 하나 얻어 오는 기능
	public User user() {
		
		return userBO.user();
	}
	
	
	
	
}
