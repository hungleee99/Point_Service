package com.vti.pointserver.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.vti.pointserver.entity.User;



public interface UserService extends UserDetailsService {

	List<User> getAllUsers();
	List<User> getByrole(String role);
	List<User> getByName(String name);
	List<User> findUserInGroup(String role,String name);
	User getById(int id);
	public void createUser(User user);
	public void updateUser(User user);
	public void deleteUser(int id);
	public void deletebyrole(String role);
	
}
