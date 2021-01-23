package com.vti.pointserver.controller;

import java.util.List;

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

import com.vti.pointserver.entity.Group;
import com.vti.pointserver.entity.Subject;
import com.vti.pointserver.entity.User;
import com.vti.pointserver.service.GroupService;
import com.vti.pointserver.service.GroupUserService;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api/v1/groups")
public class GroupController {
	@Autowired
	private GroupService groupService;

	@Autowired
	private GroupUserService groupUserService;

	// tat ca cac group
	@GetMapping()
	public ResponseEntity<?> getAllGroup() {
		return new ResponseEntity<List<Group>>(groupService.getAll(), HttpStatus.OK);
	}

	// Group theo id
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> getGroupById(@PathVariable(name = "id") Integer id) {
		return new ResponseEntity<Group>(groupService.getGroupById(id), HttpStatus.OK);
	}

	//Create group
	@PostMapping()
	public ResponseEntity<?> createGroup(@RequestBody Group group) {
		// check group exists
		if (!groupService.checkGroupExists(group.getGroupName())) {
			return new ResponseEntity<Group>(groupService.createGroup(group), HttpStatus.OK);
		}
		return new ResponseEntity<Group>(groupService.updateGroup(group), HttpStatus.OK);
	}
	
	//Update Group
	@PutMapping()
	public ResponseEntity<?> updateGroup(@RequestBody Group group) {
		// check group exists
		if (!groupService.checkGroupExists(group.getGroupName())) {
			return new ResponseEntity<Group>(groupService.createGroup(group), HttpStatus.OK);
		}
		return new ResponseEntity<Group>(groupService.updateGroup(group), HttpStatus.OK);
	}
	
	//Delete group
	@DeleteMapping()
	public void deleteGroup(@RequestParam(name = "id")Integer id){
		groupService.deleteGroup(id);
	}
	
	//User trong 1 group theo groupId
	@GetMapping(value = "/users/{id}")
	public ResponseEntity<?> getUsersOfGroup(@PathVariable(name = "id") Integer id) {
		return new ResponseEntity<List<User>>(groupUserService.getUsersOfGroup(id), HttpStatus.OK);
	}
	
}
