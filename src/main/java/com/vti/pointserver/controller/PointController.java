package com.vti.pointserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vti.pointserver.entity.Point;
import com.vti.pointserver.entity.User;
import com.vti.pointserver.service.PointService;
import com.vti.pointserver.service.UserService;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api/v1")

public class PointController {
	@Autowired
	private PointService service;
	
	
//	danh sach cac diem cua 1 user
	@GetMapping(value = "/user/{id}")
	
	public ResponseEntity<?> getByID(@PathVariable(name= "id") int id) {	
		return new ResponseEntity<Point>(service.getById1(id), HttpStatus.OK);
	}
}
