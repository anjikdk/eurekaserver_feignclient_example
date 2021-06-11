  package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employe;
import com.example.demo.repositery.EmployeRepositery;

@Service
public class EmployeService {
	
	@Autowired
	EmployeRepositery employeRepositery;
	
	
	public List<Employe> getAll(){
		List<Employe> list=employeRepositery.findAll();
		return list;
	}
	
	public Employe save(Employe employe){
		Employe list=employeRepositery.save(employe);
		return list;
	}
	
	public void deleteById(int id){
	    employeRepositery.deleteById(id);
	}
	
	public Employe upDate(Employe employe){
		Employe list=employeRepositery.save(employe);
		return list;
	}

}
