package com.bapei.shoppingcart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bapei.shoppingcart.entity.ResponseEntity;
import com.bapei.shoppingcart.dao.UserDAO;
import com.bapei.shoppingcart.entity.User;

@Service
public class UserService {

	@Autowired
	UserDAO userDAO;
	
	public ResponseEntity<User> saveUser(User user) {
		return userDAO.saveUser(user);
	}
	
	public ResponseEntity<List<User>> getAllUsers() {
		return userDAO.getAllUsers();
	}
	
	public ResponseEntity<User> validateUser(User user) {
		String email = user.getEmail();
		String password = user.getPassword();
		return userDAO.validateUser(email, password);
	}
	
	
}
