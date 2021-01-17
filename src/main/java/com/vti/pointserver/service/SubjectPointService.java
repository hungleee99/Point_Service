package com.vti.pointserver.service;

import java.util.List;

import com.vti.pointserver.entity.SubjectPoint;

public interface SubjectPointService {
	List<SubjectPoint> findByGroup(Integer id);
	
	SubjectPoint findBySubject(String name);
	
	SubjectPoint save(SubjectPoint subjectPoint);
	
	void add(SubjectPoint subjectPoint);
	
	List<SubjectPoint> findByPointBetween(Float min, Float max);
}
