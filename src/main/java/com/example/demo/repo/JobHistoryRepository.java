package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.JobHistory;
import com.example.demo.model.JobHistoryPK;

public interface JobHistoryRepository extends CrudRepository<JobHistory, JobHistoryPK> {

}
