package com.vti.pointserver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vti.pointserver.entity.SubjectPoint;
<<<<<<< HEAD
=======
import com.vti.pointserver.entity.User;
>>>>>>> 631892d166cd0f6160c2a1b300e1b2a69955ed77

public interface SubjectPointRepository extends JpaRepository<SubjectPoint, Integer> {
	List<SubjectPoint> findByTrungBinhGreaterThan(Integer min);
	
	List<SubjectPoint> findByTrungBinhBetween(Integer min, Integer max);
	
<<<<<<< HEAD
	List<SubjectPoint> findByGroupId(Integer groupId);
	
	SubjectPoint findByUserId(Integer userId);
	
	SubjectPoint findBySubjectName(String name);
=======
	List<SubjectPoint> findByUserId(Integer userId);
	
	List<SubjectPoint> findBySubjectId(Integer id);
	
>>>>>>> 631892d166cd0f6160c2a1b300e1b2a69955ed77
}
