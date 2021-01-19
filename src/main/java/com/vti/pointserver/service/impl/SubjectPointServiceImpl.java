package com.vti.pointserver.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vti.pointserver.entity.SubjectPoint;
import com.vti.pointserver.repository.SubjectPointRepository;
import com.vti.pointserver.service.SubjectPointService;

@Service
public class SubjectPointServiceImpl implements SubjectPointService {
	@Autowired
	private SubjectPointRepository spRepository;

	@Override
	public List<SubjectPoint> findByGroup(Integer id) {
		return spRepository.findByGroupId(id);
	}

	@Override
	public SubjectPoint findBySubject(String name) {
		return spRepository.findBySubjectName(name);
	}

	@Override
	public SubjectPoint save(SubjectPoint subjectPoint) {
		return spRepository.save(subjectPoint);
	}

	@Override
	public List<SubjectPoint> gioi() {
		return spRepository.findByTrungBinhGreaterThan(8);
	}

	@Override
	public List<SubjectPoint> kha() {
		return spRepository.findByTrungBinhBetween(5 , 8);
	}

	@Override
	public List<SubjectPoint> tb() {
		return spRepository.findByTrungBinhBetween(0 , 5);
	}


}
