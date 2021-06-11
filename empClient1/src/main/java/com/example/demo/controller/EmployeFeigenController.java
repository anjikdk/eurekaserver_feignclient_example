package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.client.EmployeClient;
import com.example.demo.model.Employe;

@RestController
public class EmployeFeigenController {
	@Autowired
	EmployeClient employeClient;

	@GetMapping("/getAllEmployes2")
	public List<Employe> get(){
		return employeClient.get();
	}
	
	@PostMapping("/saveEmploye2")
	public Employe save(@RequestBody Employe employe){
		return employeClient.save(employe);
	}
	
	@DeleteMapping("/deleteById2/{id}")
	public Employe deleteById(@PathVariable int id){
		return employeClient.deleteById(id);
	}
	
	@PutMapping("/upDateEmploye2")
	public Employe upDate(@RequestBody Employe employe){
		return employeClient.upDate(employe);
	}

}
