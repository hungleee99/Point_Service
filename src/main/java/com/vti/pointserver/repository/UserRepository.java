package com.vti.pointserver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.vti.pointserver.entity.User;


public interface UserRepository extends JpaRepository<User, Integer> {


	public User findByUserName(String name);
<<<<<<< HEAD
	public User findByrole(String role);
=======
	public List<User> findByrole(String role);
	public User findById(int id);
	
	@Transactional
	@Modifying
	@Query(value = "DELETE FROM `User` u WHERE u.role = ?1",nativeQuery = true)
	public void deleteByGrouprole(@Param("role") String role);
	
//	@Transactional
//	@Modifying
//	@Query(value = "SELECT u.* FROM `User` u WHERE u.userName LIKE CONCAT('%',:userName,'%')",nativeQuery = true)
//	public List<User> searchByname(@Param("userName") String userName);
	
//	@Transactional
//	@Modifying
//	@Query(value = "SELECT * FROM `User` u WHERE u.role =?1 and u.id between :first and :last",nativeQuery = true)
//	public List<User> findUserOfgroup(@Param("role") String role,@Param("first") int first,@Param("last") int last);
	
>>>>>>> b90dd2349c7cd94492424047d5f6997b1aa34fd0
}
