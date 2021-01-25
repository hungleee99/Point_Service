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
	List<User> getByrole(String role);
<<<<<<< HEAD
	public User getByid(int id);
	public void createUser(User user);
	public void updateUser(User user);
	public void deleteUser(int id);
	public void deleteByGrouprole(String role);
//	List<User> searchByname(String userName);
//	List<User> findUserOfgroup(String role,int first,int last);
=======
	List<User> getByName(String name);
	List<User> findUserInGroup(String role,String name);
	User getById(int id);
	public void createUser(User user);
	public void updateUser(User user);
	public void deleteUser(int id);
	public void deletebyrole(String role);
	
>>>>>>> ed70bc1fe241e593893fe4d071ac909701ff6297
}
