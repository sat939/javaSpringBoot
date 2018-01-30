package com.example.rest.services.restful.webservices;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserGet{

//@GetMapping(path= "/getAll")
//public List<User> findAllUsers(){
//	
//	List<User> allList=null;
//	allList = UserDAO.findAll();
//
//	return allList;
//	
//}
//
//@GetMapping(path="/getOne/{id}")
//public User findOneUser(@PathVariable int id) {
//	User i = UserDAO.getOne(id);
//	return i;
//}
//
//@PostMapping(path= "/saveUser")
//public String saveUser() {
//	
//}
	
	@Autowired
	private UserDAO service;
	
	@GetMapping(path= "/getAll")
	public List<User> findAllUsers(){
//		
//		List<User> allList=null;
//		allList = UserDAO.findAll();

		return service.findAll();
		
	}

	@GetMapping(path="/getOne/{id}")
	public User findOneUser(@PathVariable int id) {
		User u1 = service.getOne(id);
		if(u1==null) {
			throw new UserNotFoundException("id - " + id);
		}
		
		return u1;
	}

	@PostMapping(path= "/saveUser")
	public ResponseEntity<Object> saveUser(@Valid @RequestBody User u) {
		
		User a = service.save(u);
//		if(a == null) {
//			throw new UserNotFoundException("id" - id)
//		}
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(a.getId()).toUri();
		
		return ResponseEntity.created(location).build();
		
	}
	
	@DeleteMapping(path="/deleteId/{id}")
	public void deleteById(@PathVariable int id) {
		User u2 = service.delete(id);
 
		
	}


}
