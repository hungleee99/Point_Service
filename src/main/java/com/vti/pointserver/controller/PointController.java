package com.vti.pointserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vti.pointserver.entity.SubjectPoint;
import com.vti.pointserver.entity.User;
import com.vti.pointserver.service.PointService;
import com.vti.pointserver.service.UserService;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api/v1")

public class PointController {
	@Autowired
	private PointService service;
	
//	danh sach cac tai khoan student
	@GetMapping(value = "/admin/list")
	public ResponseEntity<?> getAllStudent() {
		return new ResponseEntity<>(service.getAllStudent(), HttpStatus.OK);
	}

//	danh sach cac diem cua 1 user
	@GetMapping(value = "/user/{id}")
	
	public ResponseEntity<?> getByID(@PathVariable(name= "id") int id) {	
		return new ResponseEntity<SubjectPoint>(service.getById1(id), HttpStatus.OK);
	}
	
//	danh sach subject point sap xep DESC
	@GetMapping(value = "/point/list-desc")
	public ResponseEntity<?>findAllDesc() {
		return new ResponseEntity<>(service.findAllDesc(), HttpStatus.OK);
	}
//	danh sach subject point sap xep ASC
	@GetMapping(value = "/point/list-desc")
	public ResponseEntity<?>findAllAsc() {
		return new ResponseEntity<>(service.findAllAsc(), HttpStatus.OK);
	}
	
	// update diem theo id
		@PutMapping(value = "/user/update/{id}")
		public ResponseEntity<?> updatePoint(@PathVariable(name= "userId") int userId,@RequestBody subject_point point) {
			point.setUserId(userId);;
			service.updatePoint(point);
			return new ResponseEntity<String>("Update Success!", HttpStatus.OK);
		}
	// insert diem theo id
		@PutMapping(value = "/user/insert/{id}")
		public ResponseEntity<?> insertPoint(@PathVariable(name= "userId") int userId,@RequestBody subject_point point) {
			point.setUserId(userId);;
			service.insertPoint(point);
			return new ResponseEntity<String>("Update Success!", HttpStatus.OK);
		}	
}
