package com.springdemo.sam.Springrestdemo.user;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserDaoService service;

	@GetMapping("/getusers")
	private List<User> getUsers() {
		List<User> users = service.findall();
		return users;
	}
	
	@GetMapping("/getuser/{id}")
	private User getuser(@PathVariable int id) throws UserNotFoundException {
		User user = service.findOne(id);
		if (user == null) 
			throw new UserNotFoundException ("id"+id);
		
		return user;
	}
	
	@PostMapping("/save")
	private User save(@Valid @RequestBody User user) {
		service.save(user);
		return user;
	}
	
	@DeleteMapping("/deleteuser/{id}")
	private List<User> deleteUser(@PathVariable int id) {
		List<User> users = service.deleteUser(id);
		return users;
	}
}
