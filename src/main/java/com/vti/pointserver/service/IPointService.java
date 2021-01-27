package com.vti.pointserver.service;

import java.util.List;

import com.vti.pointserver.entity.SubjectPoint;
import com.vti.pointserver.entity.User;




public interface IPointService {
	public List<SubjectPoint> getAllPoint();
	public List<SubjectPoint> getById(int id);
	public SubjectPoint getById1(int id);
	List<User> getAllStudent();
	public SubjectPoint getByPoint(byte point);

	public void insertPoint(SubjectPoint point);

	public void updatePoint(SubjectPoint point);
	List<SubjectPoint> findAllDesc();
	List<SubjectPoint> findAllAsc();
	List<SubjectPoint> filter();

}
