package com.vti.pointserver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vti.pointserver.entity.Group;

public interface GroupRepository extends JpaRepository<Group, Integer> {
	List<Group> findByManagerId(Integer id);
	
	boolean existsByGroupName(String groupName);
}
