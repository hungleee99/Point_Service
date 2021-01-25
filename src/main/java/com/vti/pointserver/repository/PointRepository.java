package com.vti.pointserver.repository;

import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import com.vti.pointserver.entity.SubjectPoint;
import com.vti.pointserver.entity.User;


public interface PointRepository extends JpaRepository<SubjectPoint, Short> {
	
	public SubjectPoint findByPoint(byte point);
	public SubjectPoint getById(int id);
	public List<SubjectPoint> findById(int id);
	public List<SubjectPoint> findAllDesc();
	public List<SubjectPoint> findAllAsc();
	
	@Query("SELECT s FROM subject_point s WHERE s.`trungbinh` between ?1 and ?2 ")
	public List<SubjectPoint> filter(@Param("`trungbinh`")Short value1,
									  @Param("`trungbinh`")Short value2);
	
	@Transactional
	@Modifying
	@Query(value = "SELECT u.* FROM `User` u WHERE u.role = Student",nativeQuery = true)
	public List<User> getAllStudent();
	
	
	
	
}
