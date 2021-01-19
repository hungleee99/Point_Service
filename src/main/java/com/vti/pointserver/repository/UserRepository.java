package com.vti.pointserver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.vti.pointserver.entity.User;


public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByUserName(String userName);
	public User findById(int id);
	
	@Query("SELECT u FROM User u WHERE u.userName LIKE %?1%")
	public List<User> findByName(String userName);
	
	@Query("SELECT u FROM User u WHERE u.role = :role")
	public List<User> findByrole(@Param("role")String role);
	
	@Query("SELECT u FROM User u WHERE u.role = :role and u.userName LIKE %:userName%")
	public List<User> findUserInGroup(@Param("role")String role,
									  @Param("userName")String userName);
	
	@Modifying
	@Transactional
	@Query(value = "DELETE FROM User u WHERE u.role = ?1", nativeQuery = true)
	public void deleteByRole(String role);
}
