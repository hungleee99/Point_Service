package com.vti.pointserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vti.pointserver.entity.User;


public interface UserRepository extends JpaRepository<User, Integer> {


	public User findByUserName(String name);
	public User findByrole(String role);
}
