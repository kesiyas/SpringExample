package com.kasiyas.spring.ex.jsp.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kasiyas.spring.ex.jsp.dao.UserDAO;
import com.kasiyas.spring.ex.jsp.model.User;

@Service
public class UserBO {
	
	@Autowired
	private UserDAO userDAO;

	// new user 데이터 저장
	// 이름, 생년월일, 자기소개, 이메일
	
	public int addUser(String name, String brithDay, String introduce, String email) {
		
		return userDAO.insertUser(name, brithDay, introduce, email);
	}
	
	public int addUserByObject(User user) {
		
		return userDAO.insertUserByObject(user);
	}
	
	public User lastUser() {
		
		return userDAO.selectUser();
	}
	
}
