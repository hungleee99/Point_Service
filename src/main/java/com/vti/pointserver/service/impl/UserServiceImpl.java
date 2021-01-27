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
<<<<<<< HEAD:src/main/java/com/vti/pointserver/service/impl/UserServiceImpl.java
<<<<<<< HEAD:src/main/java/com/vti/pointserver/service/UserServiceImpl.java
	public User getByid(int id) {
		return repository.findById(id);
		
	}

	@Override
	public void deleteByGrouprole(String role) {
		 repository.deleteByGrouprole(role);
	}

//	@Override
//	public List<User> searchByname(String userName) {
//		return repository.searchByname(userName);
//		
//	}

//	@Override
//	public List<User> findUserOfgroup(String role, int first, int last) {
//		return repository.findUserOfgroup(role, first, last);
//		
//	}
=======
=======
>>>>>>> 631892d166cd0f6160c2a1b300e1b2a69955ed77:src/main/java/com/vti/pointserver/service/UserServiceImpl.java
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
<<<<<<< HEAD:src/main/java/com/vti/pointserver/service/impl/UserServiceImpl.java
>>>>>>> ed70bc1fe241e593893fe4d071ac909701ff6297:src/main/java/com/vti/pointserver/service/impl/UserServiceImpl.java
=======
>>>>>>> 631892d166cd0f6160c2a1b300e1b2a69955ed77:src/main/java/com/vti/pointserver/service/UserServiceImpl.java
}
