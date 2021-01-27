package com.vti.pointserver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.vti.pointserver.entity.SubjectPoint;
import com.vti.pointserver.entity.User;
import com.vti.pointserver.repository.PointRepository;

@Service
public class PointService implements IPointService{

	@Autowired
	private PointRepository repository;
	
	
	public List<SubjectPoint> getAllPoint() {
		
		return repository.findAll();
	}
	public SubjectPoint getByPoint(byte point) {
		return repository.findByPoint(point);
	}
	public void insertPoint(SubjectPoint point) {
		repository.save(point);	
	}

	public void updatePoint(SubjectPoint point) {
		repository.save(point);
	}

	@Override
	public List<SubjectPoint> getById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public SubjectPoint getById1(int id) {
		// TODO Auto-generated method stub
		return repository.getById(id);
	}

	@Override
	public List<User> getAllStudent() {
		// TODO Auto-generated method stub
		return repository.getAllStudent();
	}
	
	//@Override
	//public List<SubjectPoint> filter() {
	//	return repository.filter(Short value1,Short value2)
	//}
	
	
	@Override
    public List<SubjectPoint> findAllDesc() {
        return repository.findAll(Sort.by(Sort.Direction.DESC, "`trungbinh`"));       
    }   
	@Override
    public List<SubjectPoint> findAllAsc() {
        return repository.findAll(Sort.by(Sort.Direction.ASC, "`trungbinh`"));
    }
	
}



	

	

