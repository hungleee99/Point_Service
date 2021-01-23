package com.vti.pointserver.service;

import java.util.List;

import com.vti.pointserver.entity.SubjectPoint;
import com.vti.pointserver.entity.User;

public interface SubjectPointService {
	List<SubjectPoint> findBySubject(Integer id);
	
	List<SubjectPoint> findByUser(Integer id);
	
	SubjectPoint save(SubjectPoint subjectPoint);
	
	List<SubjectPoint> gioi();
	
	List<SubjectPoint> kha();
	
	List<SubjectPoint> tb();
}
