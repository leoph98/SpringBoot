package com.example.progweb.Progweb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.progweb.Progweb.entities.User;
import com.example.progweb.Progweb.repositories.UserRepository;

@Component
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", (long) 98888888, "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", (long) 97777777, "123456");

		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}