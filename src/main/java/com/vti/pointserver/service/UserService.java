package com.vti.pointserver.service;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.transaction.annotation.Transactional;

import com.vti.pointserver.entity.User;



public interface UserService extends UserDetailsService {
	List<User> getAllUsers();
<<<<<<< HEAD
	public User getByrole(String role);
=======
	List<User> getByrole(String role);
	public User getByid(int id);
>>>>>>> b90dd2349c7cd94492424047d5f6997b1aa34fd0
	public void createUser(User user);
	public void updateUser(User user);
	public void deleteUser(int id);
	public void deleteByGrouprole(String role);
//	List<User> searchByname(String userName);
//	List<User> findUserOfgroup(String role,int first,int last);
}
