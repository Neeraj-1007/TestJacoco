package com.test.springBootJWT.controller;

import java.security.Principal;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.springBootJWT.entity.User;
import com.test.springBootJWT.entity.UserRequest;
import com.test.springBootJWT.entity.UserResponse;
import com.test.springBootJWT.service.UserServiceInt;
import com.test.springBootJWT.util.JwtUtil;

@RestController
@RequestMapping("/")
public class UserController {

	@Autowired
	private UserServiceInt userService;

	@Autowired
	private JwtUtil util;

	@Autowired
	private AuthenticationManager authenticationManager;

	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody User user) {
		System.out.println("in save method");
		Integer id = userService.saveUser(user);

		String body = "User " + id + " saved";
		return ResponseEntity.ok(body);
	}

	// validate user and generate token

	@PostMapping("/login")
	public ResponseEntity<UserResponse> loginUser(@RequestBody UserRequest userRequest) {

		authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(userRequest.getUserName(), userRequest.getPassword()));
		String token = util.generateToken(userRequest.getUserName());
		return ResponseEntity.ok(new UserResponse("Success!!", token));

	}

	@PostMapping("/welcome")
	public ResponseEntity<String> accessData(Principal p) {
		return ResponseEntity.ok("Hello Brother  "+p.getName());
	}

}
