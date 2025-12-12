package com.nischay.blog.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nischay.blog.app.payloads.LoginRequest;
import com.nischay.blog.app.payloads.UserDto;
import com.nischay.blog.app.services.UserService;

@RestController
@RequestMapping("/api/auth/")
public class AuthRestController {

	@Autowired
	private UserService userService;

	
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
		return ResponseEntity.ok("Login successful (no authentication enabled)");
	}
	

	//register new user API
	@PostMapping("/register")
	public ResponseEntity<UserDto> registerNewUser(@RequestBody UserDto userDto){
		UserDto registeredNewUser = this.userService.registerNewUser(userDto);
		
		return new ResponseEntity<UserDto>(registeredNewUser, HttpStatus.CREATED);
		
	}
}
