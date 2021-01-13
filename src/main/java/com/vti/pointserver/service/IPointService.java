package com.vti.pointserver.service;

import java.util.List;

import com.vti.pointserver.entity.Point;



public interface IPointService {
	public List<Point> getAllPoint();
	public List<Point> getById(int id);
	public Point getById1(int id);

	public Point getByPoint(byte point);

	public void insertPoint(Point point);

	public void updatePoint(Point point);

}
