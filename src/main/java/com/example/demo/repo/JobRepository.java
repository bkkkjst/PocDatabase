package com.example.demo.repo;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Job;

public interface JobRepository extends CrudRepository<Job, String>{
	
	List<Job> findAllByJobTitleNotNull();
	
	List<Job> readAllByJobTitleNotNull();
	
	List<Job> findByJobTitleIgnoreCaseContaining(@Param("title") String name);
	
	int countByJobTitleNotNull();
	
	int countByJobTitleIgnoreCaseContaining(@Param("title") String name);
	
	List<Job> findOneByJobTitle(@Param("title") String name);
	
	boolean existsByJobTitleIgnoreCaseContaining(@Param("title") String name);
	
	//Test Support keyword
	
	List<Job> findByJobIdAndJobTitle(@Param("id") String id, @Param("title") String title);
	
	List<Job> findByJobIdOrJobTitle(@Param("id") String id, @Param("title") String title);
	
	List<Job> findByJobTitleIs(@Param("title") String title);
	
	List<Job> findByJobTitleEquals(@Param("title") String title);
	
	List<Job> findByMaxSalaryBetween(@Param("min") BigDecimal min, @Param("max") BigDecimal max);
	
	List<Job> findByMaxSalaryLessThan(@Param("value") BigDecimal value);
	
	List<Job> findByMaxSalaryLessThanEqual(@Param("value") BigDecimal value);
	
	List<Job> findByMaxSalaryGreaterThan(@Param("value") BigDecimal value);
	
	List<Job> findByMaxSalaryGreaterThanEqual(@Param("value") BigDecimal value);
	
	List<Job> findByJobTitleLike(@Param("title") String title);
	
	List<Job> findByJobTitleNotLike(@Param("title") String title);
	
	List<Job> findByJobTitleStartingWith(@Param("title") String title);
	
	List<Job> findByJobTitleEndingWith(@Param("title") String title);
	
	List<Job> findByJobTitleOrderByJobTitleDesc(@Param("title") String title);
	
	List<Job> findByJobTitleIgnoreCaseContainingOrderByJobTitleDesc(@Param("title") String title);

}
