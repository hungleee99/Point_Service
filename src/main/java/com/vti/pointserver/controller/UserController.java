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
@RequestMapping(value = "/api/v1")
public class UserController {

	@Autowired
	private UserService service;

<<<<<<< HEAD
=======
//	danh sach cac tai khoan
>>>>>>> 86b93fc (update Service and Repository (non ServiceImpl))
	@GetMapping(value = "/admin/list")
	public ResponseEntity<?> getAllUsers() {
		return new ResponseEntity<>(service.getAllUsers(), HttpStatus.OK);
	}
	@GetMapping(value = "/{role}")
	public ResponseEntity<?> getByUser(@PathVariable(name= "role") String role) {
		return new ResponseEntity<User>(service.getByrole(role), HttpStatus.OK);
	}
<<<<<<< HEAD
=======
	
//	detail 1 tai khoan
	@GetMapping(value = "/admin1/{id}")
	public ResponseEntity<?> getByID(@PathVariable(name= "id") int id) {	
		return new ResponseEntity<User>(service.getByid(id), HttpStatus.OK);
	}
	

	// danh sach cac tai khoan theo role
	@GetMapping(value = "/admin/{role}")
	public ResponseEntity<?> getByUser(@PathVariable(name= "role") String role) {
		return new ResponseEntity<>(service.getByrole(role), HttpStatus.OK);
	}
	
	// add tai khoan
>>>>>>> 86b93fc (update Service and Repository (non ServiceImpl))
	@PostMapping(value = "/admin")
	public ResponseEntity<?> createUser(@RequestBody User user) {
		service.createUser(user);
		return new ResponseEntity<String>("Create Success!", HttpStatus.OK);
	}
<<<<<<< HEAD
=======
	// update tai khoan theo id
>>>>>>> 86b93fc (update Service and Repository (non ServiceImpl))
	@PutMapping(value = "/admin/{id}")
	public ResponseEntity<?> updateUser(@PathVariable(name= "id") int id,@RequestBody User user) {
		user.setId(id);
		service.updateUser(user);
		return new ResponseEntity<String>("Update Success!", HttpStatus.OK);
	}
<<<<<<< HEAD
=======
	// xoa tai khoan 
>>>>>>> 86b93fc (update Service and Repository (non ServiceImpl))
	@DeleteMapping(value = "/admin/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable(name = "id") int id) {
		service.deleteUser(id);
		return new ResponseEntity<String>("Delete Success!", HttpStatus.OK);
	}
}
