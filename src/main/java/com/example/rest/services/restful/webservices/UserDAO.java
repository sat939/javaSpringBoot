package com.example.rest.services.restful.webservices;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDAO {

	private static List<User> list = new ArrayList<User>();
	
	static {
		list.add(new User(101, "Sathvik", new Date()));
		list.add(new User(102, "punith", new Date()));
		list.add(new User(103, "ruthvik", new Date()));
		list.add(new User(104, "Sathvik1", new Date()));
		list.add(new User(105, "punith2", new Date()));
		list.add(new User(106, "ruthvik3", new Date()));
	}
	
	public List<User> findAll() {
		
		return list;
		
	}
	
	public User delete(int id) {
		
		Iterator<User> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			 
			User user = iterator.next();
			if(user.getId()== id) {
				
				iterator.remove();
				return user;
			}
		}
		
//		list.remove(id);
		
		return null;
	} 
	
	public  User getOne(int id) {
		
//		List<User> temp = new ArrayList<User>();
		User ui= null;
		for(User u:list) {
			if(u.getId() == id) {
				 ui = u;
			}
		}
		
		return ui;
	}
	
	public User save(User u) {
		
		list.add(u);
		return u;
		
	}
}
