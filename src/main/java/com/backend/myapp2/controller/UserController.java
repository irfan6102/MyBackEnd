package com.backend.myapp2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.myapp2.model.User;
import com.backend.myapp2.repository.UserRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/user")

public class UserController {
	
	@Autowired
	UserRepository userRepo;
	
	@PostMapping("/saveUser")
	public User save(@RequestBody User user) {
		userRepo.save(user);
		return user;
	}
	
	@GetMapping("/getAll")
	public List<User> getAllUser(){
		return userRepo.findAll();
	
	}
	
   
	
	
	

}
