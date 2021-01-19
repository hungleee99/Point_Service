package com.vti.pointserver.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.vti.pointserver.entity.User;
import com.vti.pointserver.repository.UserRepository;
import com.vti.pointserver.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;

	@Override
	public List<User> getAllUsers() {
		return repository.findAll();
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// Check user exists by username
		User user = repository.findByUserName(username);

		if (user == null) {
			throw new UsernameNotFoundException(username);
		}

		return new org.springframework.security.core.userdetails.User(
				user.getUserName(), 
				user.getPassword(),
				AuthorityUtils.createAuthorityList(user.getRole()));
	}

	@Override
	public void createUser(User user) {
		repository.save(user);		
	}

	@Override
	public void updateUser(User user) {
		repository.save(user);
	}

	@Override
	public void deleteUser(int id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<User> getByrole(String role){
		return repository.findByrole(role);	
	}

	@Override
	public List<User> getByName(String name) {
		return repository.findByName(name);
	}

	@Override
	public void deletebyrole(String role) {
		repository.deleteByRole(role);;
		
	}

	@Override
	public User getById(int id) {	 
		return repository.findById(id);
	}

	@Override
	public List<User> findUserInGroup(String role, String name) {
		return repository.findUserInGroup(role, name);
	}
}
