package com.example.progweb.Progweb.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.progweb.Progweb.entities.User;
import com.example.progweb.Progweb.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserRepository userRepository;
	
	//FindAll
	@GetMapping("/all")
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	//findByld
	@GetMapping(value = "/{id}")
	public Optional<User> findById(@PathVariable Long id){
		Optional<User> result = userRepository.findById(id);
		return result;
	}	
	
	//Insert
	public User createUser(User user) {
		User result = userRepository.save(user);
		return result;
    }
	
	//Delete
	public void deleteUserById(Long userId) {
        if (userRepository.existsById(userId)) {
        	userRepository.deleteById(userId);
        }
    }
	
	//Update
	public User updateUser(Long userId, User updatedUser) {
        if (userRepository.existsById(userId)) {

        }
        return updatedUser;
    }
}