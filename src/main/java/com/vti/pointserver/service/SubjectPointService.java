package com.vti.pointserver.service;

import java.util.List;

import com.vti.pointserver.entity.SubjectPoint;

public interface SubjectPointService {
	List<SubjectPoint> findByGroup(Integer id);
	
	List<SubjectPoint> findBySubject(String name);
	
	List<SubjectPoint> findByUser(Integer id);
	
	SubjectPoint save(SubjectPoint subjectPoint);
	
	List<SubjectPoint> gioi();
	
	List<SubjectPoint> kha();
	
	List<SubjectPoint> tb();
}
