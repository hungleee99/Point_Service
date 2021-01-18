package com.vti.pointserver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vti.pointserver.entity.GroupUser;
import com.vti.pointserver.entity.User;

public interface GroupUserRepository extends JpaRepository<GroupUser, Integer> {
	List<User> findAllByGroupId(Integer groupId);
}
