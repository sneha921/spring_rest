package com.springdemo.sam.Springrestdemo.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<User>();
	private int usercount = 3;
	
	static {
		users.add(new User(1, "Avi", new Date()));
		users.add(new User(2, "sam", new Date()));
		users.add(new User(3, "bunny", new Date()));
	}
	
	protected List<User> findall() {
		return users;
		
	}
	
	protected User findOne(int id) {
		for (User user:users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}
	
	protected List<User> save(User user) {
		if (user.getId() == null) {
			user.setId(usercount++);
		}
		users.add(user);
		return users;
	}
	
	protected List<User> deleteUser(int id) {
		
		for(User user:users) {
			if (id == user.getId()) {
				users.remove(user);
				return users;
			}
		}
		return null;
		
	}
 }
