package com.vti.pointserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vti.pointserver.entity.User;
import com.vti.pointserver.service.UserService;



@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api/v1/users")
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping()
	public ResponseEntity<?> getAllUsers() {
		return new ResponseEntity<>(service.getAllUsers(), HttpStatus.OK);
	}
	@PostMapping()
	public ResponseEntity<?> createUser(@RequestBody User user) {
		service.createUser(user);
		return new ResponseEntity<String>("Create Success!", HttpStatus.OK);
	}
	@PutMapping(value = "/{id}")
	public ResponseEntity<?> updateUser(@PathVariable(name= "id") int id,@RequestBody User user) {
		user.setId(id);
		service.updateUser(user);
		return new ResponseEntity<String>("Update Success!", HttpStatus.OK);
	}
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable(name = "id") int id) {
		service.deleteUser(id);
		return new ResponseEntity<String>("Delete Success!", HttpStatus.OK);
	}
}
