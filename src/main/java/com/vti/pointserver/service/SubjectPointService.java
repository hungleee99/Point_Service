package com.vti.pointserver.service;

import java.util.List;

import com.vti.pointserver.entity.SubjectPoint;
<<<<<<< HEAD

public interface SubjectPointService {
	List<SubjectPoint> findByGroup(Integer id);
	
	SubjectPoint findBySubject(String name);
=======
import com.vti.pointserver.entity.User;

public interface SubjectPointService {
	List<SubjectPoint> findBySubject(Integer id);
	
	List<SubjectPoint> findByUser(Integer id);
>>>>>>> 631892d166cd0f6160c2a1b300e1b2a69955ed77
	
	SubjectPoint save(SubjectPoint subjectPoint);
	
	List<SubjectPoint> gioi();
	
	List<SubjectPoint> kha();
	
	List<SubjectPoint> tb();
}
