package com.bapei.shoppingcart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bapei.shoppingcart.entity.User;
import com.bapei.shoppingcart.service.UserService;
import com.bapei.shoppingcart.entity.ResponseEntity;

@CrossOrigin("*")
@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/save")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

	@GetMapping("/getall")
	public ResponseEntity<List<User>> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@PostMapping("/validate")
	public ResponseEntity<User> validateUser(@RequestBody User user) {
		return userService.validateUser(user);
	}
	
}
