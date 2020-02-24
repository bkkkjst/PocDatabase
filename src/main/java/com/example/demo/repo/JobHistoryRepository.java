package com.example.demo.repo;

import java.sql.Clob;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Department;
import com.example.demo.model.Job;
import com.example.demo.model.JobHistory;
import com.example.demo.model.JobHistoryPK;

public interface JobHistoryRepository extends CrudRepository<JobHistory, JobHistoryPK> {
	
	@Query(nativeQuery = true, value = "SELECT HR.TEXT_LENGTH(:text) FROM DUAL")
    Integer callTextLength(@Param("text") String text);
	
	@Transactional
	@Procedure(procedureName = "ADD_JOB_HISTORY")
	boolean addJobHistory(
			@Param("p_emp_id") long employeeId,
			@Param("p_start_date") Date startDate,
			@Param("p_end_date") Date endDate,
			@Param("p_job_id") Job job,
			@Param("p_department_id") Department department
	);
	
	List<JobHistory> findByEndDateAfter(@Param("date") Date value);
	
	List<JobHistory> findByEndDateBefore(@Param("date") Date value);
	
}
