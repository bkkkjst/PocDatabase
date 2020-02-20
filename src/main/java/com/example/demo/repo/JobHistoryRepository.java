package com.example.demo.repo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Job;
import com.example.demo.model.JobHistory;
import com.example.demo.model.JobHistoryPK;

public interface JobHistoryRepository extends CrudRepository<JobHistory, JobHistoryPK> {
	
	List<JobHistory> findByEndDateAfter(@Param("date") Date value);
	
	List<JobHistory> findByEndDateBefore(@Param("date") Date value);
	
}
