package com.user.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.user.service.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/get/user/{id}")
	public ResponseEntity<String>getUserNameById(@PathVariable int id){
		return new ResponseEntity<>(userService.getUserNameById(id), HttpStatus.OK);
	}

}
