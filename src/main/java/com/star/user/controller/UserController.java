package com.star.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.star.user.entity.User;
import com.star.user.service.UserService;
import com.star.user.valueobject.ResponseTemplet;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	

	
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		System.out.println(" [UserController ] saveUser :  "+user.toString());
				return userService.saveuser(user);
	}
	
	@GetMapping("{id}")
	public ResponseTemplet getUserWithDept( @PathVariable("id")Long userId) {
		System.out.println(" [UserController ] getUserWithDept : userId -->  "+userId);
		return userService.getUserWithDept(userId);
		
	}
	
	
	@GetMapping("/all")
	public List<User> getAllUser(){
		System.out.println(" [UserController ] getAllUser :  ");
		return userService.getAllUsers();
	}
	
/*	@GetMapping("{id}")
	public User getUserById(@PathVariable("id")Long userId) {
		System.out.println(" [UserController ] getUserById userId :  "+userId);
		return userService.getByUserId(userId);
	}
	 */
	
}
