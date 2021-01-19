package com.vti.pointserver.service;

import java.util.List;

import com.vti.pointserver.entity.Subject;

public interface SubjectService {
	List<Subject> findAll();
	
	Subject save(Subject subject);
	
	Subject update(Subject subject);
	
	void delete(Integer id);
	
	Subject getSubjectById(Integer id);
}
