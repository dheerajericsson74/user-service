package com.star.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.star.user.entity.User;
import com.star.user.repository.UserRepository;
import com.star.user.valueobject.Department;
import com.star.user.valueobject.ResponseTemplet;
import com.star.user.valueobject.Department;

@Service
public class UserService {
    @Autowired
	private UserRepository userRepository;
    @Autowired
	private RestTemplate restTemplate;
    
	public User saveuser(User user) {
		System.out.println(" [UserService ] saveuser...   ");
		return userRepository.save(user);
	}

	public List<User> getAllUsers() {
		System.out.println(" [UserService ] getAllUsers...   ");
		return userRepository.findAll();
	}


	public User getByUserId(Long userId) {
		System.out.println(" [UserService ] getByUserId...   ");
		return userRepository.getByUserId(userId);
	}

	public ResponseTemplet getUserWithDept(Long userId) {
		System.out.println(" [UserService ] getUserWithDept...   ");
		ResponseTemplet resp = new ResponseTemplet();
		
		User user = userRepository.getByUserId(userId);
		
		
		Department dept = restTemplate.getForObject("http://DEPARTMENT-SERVICE/depts/"+user.getDeptId(), Department.class);
		
		resp.setDept(dept);
		resp.setUser(user);
		
		
		return resp;
	}
	
    
    
    
}
