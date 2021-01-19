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
@RequestMapping(value = "/api/v1/admin")
public class UserController {

	@Autowired
	private UserService service;

//	get list account
	@GetMapping(value = "/list")
	public ResponseEntity<?> getAllUsers() {
		return new ResponseEntity<>(service.getAllUsers(), HttpStatus.OK);
	}
	
//	find by group
	@GetMapping(value = "/group/{role}")
	public ResponseEntity<?> getByUser(@PathVariable(name= "role") String role) {
		return new ResponseEntity<>(service.getByrole(role), HttpStatus.OK);
	}
	
//	find by id
	@GetMapping(value = "/detail/{id}")
	public ResponseEntity<?> getById(@PathVariable(name= "id") int id) {
		return new ResponseEntity<User>(service.getById(id), HttpStatus.OK);
	}
//	search by name
	@GetMapping(value = "/detaillist/{name}")
	public ResponseEntity<?> getByName(@PathVariable(name= "name") String name) {
		return new ResponseEntity<>(service.getByName(name), HttpStatus.OK);
	}
	
//	filter name in group
	@GetMapping(value = "/detaillist/{role}/{name}")
	public ResponseEntity<?> findUserInGroup(@PathVariable(name= "role") String role,
											@PathVariable(name= "name") String name) {
		return new ResponseEntity<>(service.findUserInGroup(role,name), HttpStatus.OK);
	}
//	create acount
	@PostMapping()
	public ResponseEntity<?> createUser(@RequestBody User user) {
		service.createUser(user);
		return new ResponseEntity<String>("Create Success!", HttpStatus.OK);
	}
	
//	update account
	@PutMapping(value = "/{id}")
	public ResponseEntity<?> updateUser(@PathVariable(name= "id") int id,@RequestBody User user) {
		user.setId(id);
		service.updateUser(user);
		return new ResponseEntity<String>("Update Success!", HttpStatus.OK);
	}
	
//	delete by id
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable(name = "id") int id) {
		service.deleteUser(id);
		return new ResponseEntity<String>("Delete Success!", HttpStatus.OK);
	}
	
//	delete by group
	@DeleteMapping(value = "/deletegroup/{role}")
	public ResponseEntity<?> deleteByRole(@PathVariable(name = "role") String role) {
		service.deletebyrole(role);;
		return new ResponseEntity<String>("Delete Success!", HttpStatus.OK);
	}
}
