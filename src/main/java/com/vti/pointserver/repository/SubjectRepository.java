package com.vti.pointserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vti.pointserver.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {

}
