package com.example.demo.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.demo.model.Employe;


@FeignClient(name="EUREKA-SERVER-EMPLOYE2")
public interface EmployeClient {
	
	@GetMapping("/getAllEmployes")
	public List<Employe> get();
	
	@PostMapping("/saveEmploye")
	public Employe save(Employe employe);
	
	
	@DeleteMapping("/deleteById/{id}")
	public Employe deleteById(@PathVariable("id") int id);
	
	
	@PutMapping("/updateEmploye")
	public Employe upDate(Employe employe);


}
