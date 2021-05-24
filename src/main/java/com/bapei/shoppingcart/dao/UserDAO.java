package com.bapei.shoppingcart.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import com.bapei.shoppingcart.entity.User;
import com.bapei.shoppingcart.repository.UserRepository;
import com.bapei.shoppingcart.entity.ResponseEntity;

@Repository
public class UserDAO {
	
	@Autowired
	UserRepository userRepository;
	
	public ResponseEntity<User>  saveUser(User user) {
		
		ResponseEntity<User> entity = new ResponseEntity<User>();
		User result =  userRepository.save(user);
		if(result != null) {
			entity.setStatus(HttpStatus.OK.value());
			entity.setData(result);
			entity.setMessage("Success");
		} else {
			entity.setStatus(HttpStatus.BAD_REQUEST.value());
			entity.setData(null);
			entity.setMessage("Failed");
		}
		return entity;
	}

	
	public ResponseEntity<List<User>> getAllUsers() {
		ResponseEntity<List<User>> entity = new ResponseEntity<List<User>>();
		entity.setData(userRepository.findAll());
		entity.setStatus(HttpStatus.OK.value());
		return entity;
	}
	
	public ResponseEntity<User> validateUser(String email,String password) {
		ResponseEntity<User> entity = new ResponseEntity<User>();
		User result =  userRepository.validateUser(email, password);
		if(result != null) {
			entity.setStatus(HttpStatus.OK.value());
			entity.setData(result);
			entity.setMessage("Success");
		} else {
			entity.setStatus(HttpStatus.UNAUTHORIZED.value());
			entity.setData(null);
			entity.setMessage("Failed");
		}
		return entity;
	}
	
}
