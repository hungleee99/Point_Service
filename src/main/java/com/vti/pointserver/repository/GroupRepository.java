package com.vti.pointserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vti.pointserver.entity.Group;

public interface GroupRepository extends JpaRepository<Group, Integer> {

}
