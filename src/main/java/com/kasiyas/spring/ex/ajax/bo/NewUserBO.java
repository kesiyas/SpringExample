package com.kasiyas.spring.ex.ajax.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kasiyas.spring.ex.ajax.dao.NewUserDAO;
import com.kasiyas.spring.ex.jsp.model.User;

@Service
public class NewUserBO {
	@Autowired
	NewUserDAO newUserDAO;

	public List<User> getUserList() {
		
		return newUserDAO.selectUserList();
	}
	
	public int addUser(String name, String birthDay, String email) {
		
		return newUserDAO.insertUser(name, birthDay, email);
	}
	
	// email 중복 여부 알려주는 기능
	public boolean isDuplicateEmail(String email) {
		
		int count = newUserDAO.selectCountEmail(email);
		
		if(count == 0) {
			return false;			
		} else { 
			return true;
		}
	}
	
}
