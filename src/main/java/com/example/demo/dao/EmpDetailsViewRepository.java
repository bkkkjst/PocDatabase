package com.example.demo.dao;

import java.math.BigDecimal;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.EmpDetailsView;

public interface EmpDetailsViewRepository extends CrudRepository<EmpDetailsView, BigDecimal>{

}
