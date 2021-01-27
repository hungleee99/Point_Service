package com.vti.pointserver.controller;

import javax.print.attribute.standard.MediaSize.NA;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.sym.Name;
import com.vti.pointserver.entity.User;
import com.vti.pointserver.service.UserService;



@CrossOrigin("*")
@RestController
<<<<<<< HEAD
<<<<<<< HEAD
@RequestMapping(value = "/api/v1")
=======
@RequestMapping(value = "/api/v1/admin")
>>>>>>> ed70bc1fe241e593893fe4d071ac909701ff6297
=======
@RequestMapping(value = "/api/v1/admin")
>>>>>>> 631892d166cd0f6160c2a1b300e1b2a69955ed77
public class UserController {

	@Autowired
	private UserService service;

<<<<<<< HEAD
<<<<<<< HEAD
//	danh sach cac tai khoan
	@GetMapping(value = "/admin/list")
=======
//	get list account
	@GetMapping(value = "/list")
>>>>>>> ed70bc1fe241e593893fe4d071ac909701ff6297
=======
//	get list account
	@GetMapping(value = "/list")
>>>>>>> 631892d166cd0f6160c2a1b300e1b2a69955ed77
	public ResponseEntity<?> getAllUsers() {
		return new ResponseEntity<>(service.getAllUsers(), HttpStatus.OK);
	}
	
<<<<<<< HEAD
<<<<<<< HEAD
//	detail 1 tai khoan
	@GetMapping(value = "/admin1/{id}")
	public ResponseEntity<?> getByID(@PathVariable(name= "id") int id) {	
		return new ResponseEntity<User>(service.getByid(id), HttpStatus.OK);
	}
	

	// danh sach cac tai khoan theo role
	@GetMapping(value = "/admin/{role}")
=======
//	find by group
	@GetMapping(value = "/group/{role}")
>>>>>>> ed70bc1fe241e593893fe4d071ac909701ff6297
=======
//	find by group
	@GetMapping(value = "/group/{role}")
>>>>>>> 631892d166cd0f6160c2a1b300e1b2a69955ed77
	public ResponseEntity<?> getByUser(@PathVariable(name= "role") String role) {
		return new ResponseEntity<>(service.getByrole(role), HttpStatus.OK);
	}
	
<<<<<<< HEAD
<<<<<<< HEAD
	// add tai khoan
	@PostMapping(value = "/admin")
=======
=======
>>>>>>> 631892d166cd0f6160c2a1b300e1b2a69955ed77
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
>>>>>>> ed70bc1fe241e593893fe4d071ac909701ff6297
	public ResponseEntity<?> createUser(@RequestBody User user) {
		service.createUser(user);
		return new ResponseEntity<String>("Create Success!", HttpStatus.OK);
	}
	
<<<<<<< HEAD
<<<<<<< HEAD
	// update tai khoan theo id
	@PutMapping(value = "/admin/{id}")
=======
=======
>>>>>>> 631892d166cd0f6160c2a1b300e1b2a69955ed77
//	update account
	@PutMapping(value = "/{id}")
>>>>>>> ed70bc1fe241e593893fe4d071ac909701ff6297
	public ResponseEntity<?> updateUser(@PathVariable(name= "id") int id,@RequestBody User user) {
		user.setId(id);
		service.updateUser(user);
		return new ResponseEntity<String>("Update Success!", HttpStatus.OK);
	}
	
<<<<<<< HEAD
<<<<<<< HEAD
	// xoa tai khoan 
	@DeleteMapping(value = "/admin/{id}")
=======
=======
>>>>>>> 631892d166cd0f6160c2a1b300e1b2a69955ed77
//	delete by id
	@DeleteMapping(value = "/{id}")
>>>>>>> ed70bc1fe241e593893fe4d071ac909701ff6297
	public ResponseEntity<?> deleteUser(@PathVariable(name = "id") int id) {
		service.deleteUser(id);
		return new ResponseEntity<String>("Delete Success!", HttpStatus.OK);
	}
	
<<<<<<< HEAD
<<<<<<< HEAD
	// xoa nhom tk
	@DeleteMapping(value = "/adminGroup/{role}")
	public ResponseEntity<?> deleteGroup(@PathVariable(name = "role") String role) {
		service.deleteByGrouprole(role);
		return new ResponseEntity<String>("Delete Success!", HttpStatus.OK);
	}
	
	// search tk
//	@GetMapping(value = "/admin/detail/{userName}")
//	public ResponseEntity<?> searchByname(@PathVariable(name = "userName") String userName) {
//		return new ResponseEntity<>(service.searchByname(userName), HttpStatus.OK);
//	}
//	

	// filter tk trong nhom
//	@GetMapping(value = "/adminGroup/{role}")
//	public ResponseEntity<?> findUserOfgroup(@PathVariable(name = "role") String role, 
//			@RequestParam(name = "first" ,defaultValue = "1") int first, 
//			@RequestParam(name = "last" ,defaultValue = "100") int last) {
//		return new ResponseEntity<>(service.findUserOfgroup(role, first, last), HttpStatus.OK);
//		
//	}
=======
=======
>>>>>>> 631892d166cd0f6160c2a1b300e1b2a69955ed77
//	delete by group
	@DeleteMapping(value = "/deletegroup/{role}")
	public ResponseEntity<?> deleteByRole(@PathVariable(name = "role") String role) {
		service.deletebyrole(role);;
		return new ResponseEntity<String>("Delete Success!", HttpStatus.OK);
	}
<<<<<<< HEAD
>>>>>>> ed70bc1fe241e593893fe4d071ac909701ff6297
=======
>>>>>>> 631892d166cd0f6160c2a1b300e1b2a69955ed77
}
