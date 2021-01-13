package com.vti.pointserver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vti.pointserver.entity.Point;
import com.vti.pointserver.repository.PointRepository;

@Service
public class PointService implements IPointService{

	@Autowired
	private PointRepository repository;
	
	
	public List<Point> getAllPoint() {
		
		return repository.findAll();
	}

	
	public Point getByPoint(byte point) {
		return repository.findByPoint(point);
	}

	
	public void insertPoint(Point point) {
		repository.save(point);
		
	}

	
	public void updatePoint(Point point) {
		repository.save(point);
		
	}


	@Override
	public List<Point> getById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}


	@Override
	public Point getById1(int id) {
		// TODO Auto-generated method stub
		return repository.getById(id);
	}

}
