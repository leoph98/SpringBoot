package com.example.progweb.Progweb.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.progweb.Progweb.entities.User;


@Service
public interface UserService {
		
	//FindAll
	public List<User> findAll();

	//findById
	public default User findById(Long userId) {
		return null;
	}
	
	//Insert
	public User save(User user);
	
	//Delete
	public void deleteById(Long userId);
	
	//Update
	public boolean existsById(Long userId);
  
}