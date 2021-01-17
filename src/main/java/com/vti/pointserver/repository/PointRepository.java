package com.vti.pointserver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vti.pointserver.entity.Point;

public interface PointRepository extends JpaRepository<Point, Short> {
	
	public Point findByPoint(byte point);
	public Point getById(int id);
	public List<Point> findById(int id);

}
