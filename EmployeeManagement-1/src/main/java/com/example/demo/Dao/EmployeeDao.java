package com.example.demo.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Employee;

@Repository
public interface EmployeeDao  extends CrudRepository<Employee ,Integer >{

}
