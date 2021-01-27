package com.vti.pointserver.controller;

<<<<<<< HEAD
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class SubjectController {
	
=======
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vti.pointserver.entity.Subject;
import com.vti.pointserver.service.SubjectPointService;
import com.vti.pointserver.service.SubjectService;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api/v1/subjects")
public class SubjectController {
	@Autowired
	private SubjectService subjectService;

	@Autowired
	private SubjectPointService subjectPointService;

	//tat ca cac mon hoc
	@GetMapping()
	public ResponseEntity<?> getAllSubject() {
	return new ResponseEntity<List<Subject>>(subjectService.findAll(), HttpStatus.OK);
	}
	
	@PostMapping()
	  public ResponseEntity<?> createSubject(@RequestBody Subject subject) {
	    return new ResponseEntity<Subject>(subjectService.save(subject), HttpStatus.OK);
	}
	
	@PutMapping()
	  public ResponseEntity<?> updateSubject(@RequestBody Subject subject) {
	    return new ResponseEntity<Subject>(subjectService.update(subject), HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> getSubjectById(@PathVariable(name = "id") Integer id) {
	// validate param success then return list category question
	return new ResponseEntity<Subject>(subjectService.getSubjectById(id), HttpStatus.OK);
	}
>>>>>>> 631892d166cd0f6160c2a1b300e1b2a69955ed77
}
