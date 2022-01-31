package com.test.springBootJWT.service;

import java.util.Optional;

import com.test.springBootJWT.entity.User;

public interface UserServiceInt {

	
	Integer saveUser(User user);
	
	 Optional<User> findByUserName(String userName);
}
