 package com.example.demo.controller;

import java.util.List;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employe;
import com.example.demo.service.EmployeService;

@RestController
public class EmployeController {
	
	@Autowired
	EmployeService employeService;
	
	@GetMapping("/getAllEmployes")
	public List<Employe> getAll(){
		List<Employe> list=employeService.getAll();
		return list;
		
	}
	
	@PostMapping("/saveEmploye")
	public Employe svaeEmploye(@RequestBody Employe employe){
		Employe list=employeService.save(employe);
		return list;
	}
	
	@DeleteMapping("/deleteById/{id}")
	//@RequestMapping(value="/deleteById/{id}",method=RequestMethod.DELETE)
	public void deleteEmploye(@PathVariable int id){
		employeService.deleteById(id);
	}
	
	@PutMapping("/updateEmploye")
	public void upDateEmploye(@RequestBody Employe employe){
		employeService.upDate(employe);
	}
		
		

}
