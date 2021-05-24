package com.bapei.shoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bapei.shoppingcart.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	
	@Query("SELECT u FROM User u WHERE u.email = :email AND u.password = :password")
	public User validateUser(@Param("email") String email,@Param("password")String password);
	
	
}
