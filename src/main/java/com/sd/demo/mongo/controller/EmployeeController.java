package com.sd.demo.mongo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sd.demo.mongo.dto.EmployeeRepository;
import com.sd.demo.mongo.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	private Logger log = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeRepository employeeRepository; 
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<Employee> getEmployee(){
		log.info("get employee called");
		return employeeRepository.findAll();
	}
	
	@PostMapping(value="/save")
	private Employee saveEmployee(@RequestBody Employee employee){
		log.info("save employee called");
		return employeeRepository.save(employee);
	}
}
