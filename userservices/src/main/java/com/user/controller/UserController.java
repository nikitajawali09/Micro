package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.UserEntity;
import com.users.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/searchByUserId/{userId}")
	public ResponseEntity<UserEntity> searchByUserId(@PathVariable("userId") Long userId){
		UserEntity user=userService.searchByUserId(userId);
		return new ResponseEntity<>(user,HttpStatus.OK);
		
	}
	
}
