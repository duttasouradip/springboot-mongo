package com.sd.demo.mongo.dto;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sd.demo.mongo.model.Employee;


@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Long> {

}
