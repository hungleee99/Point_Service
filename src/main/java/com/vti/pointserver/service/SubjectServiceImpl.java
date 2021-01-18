package com.vti.pointserver.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vti.pointserver.entity.Group;
import com.vti.pointserver.entity.Subject;
import com.vti.pointserver.repository.SubjectRepository;
import com.vti.pointserver.service.SubjectService;

@Service
public class SubjectServiceImpl implements SubjectService{
	@Autowired
	private SubjectRepository subjectRepository;
	
	@Override
	public List<Subject> findAll() {
		return subjectRepository.findAll();
	}

	@Override
	public Subject save(Subject subject) {
	    return subjectRepository.save(subject);	
	}

	@Override
	public Subject update(Subject subject) {
	    // get Subject by id
	    Subject subjectCurrent = getSubjectById(subject.getId());
	    subject.setSubjectName(subjectCurrent.getSubjectName());
	    return subjectRepository.save(subjectCurrent);	
	}

	@Override
	public void delete(Integer id) {
		subjectRepository.deleteById(id);
	}

	@Override
	public Subject getSubjectById(Integer id) {
		return subjectRepository.getOne(id);
	}
	
}
