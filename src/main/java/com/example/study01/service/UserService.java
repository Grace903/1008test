package com.example.study01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.study01.domain.User;
import com.example.study01.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void insertUser(User user) {
		userRepository.save(user);
	}
	
	

}
