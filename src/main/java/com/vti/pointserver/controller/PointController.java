package com.vti.pointserver.controller;

<<<<<<< HEAD
=======
import java.util.List;

>>>>>>> 631892d166cd0f6160c2a1b300e1b2a69955ed77
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
<<<<<<< HEAD
import com.vti.pointserver.entity.SubjectPoint;
import com.vti.pointserver.entity.User;
import com.vti.pointserver.service.PointService;
=======

import com.vti.pointserver.entity.Subject;
import com.vti.pointserver.entity.SubjectPoint;
import com.vti.pointserver.entity.User;
import com.vti.pointserver.service.GroupUserService;
import com.vti.pointserver.service.SubjectPointService;
import com.vti.pointserver.service.SubjectService;
>>>>>>> 631892d166cd0f6160c2a1b300e1b2a69955ed77
import com.vti.pointserver.service.UserService;

@CrossOrigin("*")
@RestController
<<<<<<< HEAD
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
=======
@RequestMapping(value = "/api/v1/points")

public class PointController {
	@Autowired
	private GroupUserService groupUserService;
	
	@Autowired
	private SubjectService subjectService;

	@Autowired
	private SubjectPointService subjectPointService;
	
//	danh sach cac diem cua 1 user
	@GetMapping(value = "/user/{id}")
	public ResponseEntity<?> getByID(@PathVariable(name= "id") int id) {	
		return new ResponseEntity<List<SubjectPoint>>(subjectPointService.findByUser(id), HttpStatus.OK);
	}
	
//	//Danh sach diem cua 1 group
//	@GetMapping(value = "/group/{id}")
//	public ResponseEntity<?> getByGroupId(@PathVariable(name= "id") int id) {
//		List<User> users = groupUserService.getUsersOfGroup(id);
//		return new ResponseEntity<List<SubjectPoint>>(subjectPointService.findByGroup(users), HttpStatus.OK);
//	}
	
	//Update diem cua 1 sinh vien
	@PutMapping(name = "/user/{id}")
	  public ResponseEntity<?> updatePoint(@PathVariable(name= "id") int id, @RequestBody SubjectPoint subjectPoint) {
		subjectPoint.setId(id);
		subjectPointService.save(subjectPoint);
	    return new ResponseEntity<SubjectPoint>(subjectPointService.save(subjectPoint), HttpStatus.OK);
	}
	
	//Danh sach hoc sinh gioi
	@GetMapping(value = "/users/gioi")
	public ResponseEntity<?> HSG() {	
		return new ResponseEntity<List<SubjectPoint>>(subjectPointService.gioi(), HttpStatus.OK);
	}
	//Danh sach hoc sinh kha
	@GetMapping(value = "/users/kha")
	public ResponseEntity<?> HSK() {	
		return new ResponseEntity<List<SubjectPoint>>(subjectPointService.kha(), HttpStatus.OK);
	}
	//Danh sach hoc sinh gioi
	@GetMapping(value = "/users/tb")
	public ResponseEntity<?> HSTB() {	
		return new ResponseEntity<List<SubjectPoint>>(subjectPointService.tb(), HttpStatus.OK);
	}
	//Danh sach diem theo ten mon
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> getBySubjectId(@PathVariable(name= "id") Integer id) {	
		return new ResponseEntity<List<SubjectPoint>>(subjectPointService.findBySubject(id), HttpStatus.OK);
	}
>>>>>>> 631892d166cd0f6160c2a1b300e1b2a69955ed77
}
