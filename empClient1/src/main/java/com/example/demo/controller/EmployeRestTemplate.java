package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.client.EmployeClient;
import com.example.demo.model.Employe;

@RestController
public class EmployeRestTemplate {
	
	private static String url="http://EUREKA-SERVER-EMPLOYE2/";

	@Autowired
	RestTemplate restTemplate;
	
	
	
	
	
	@GetMapping("/getAllEmployes1")
	public List<Employe> getAll()
	{
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity <Employe> entity = new HttpEntity<>(headers);
		ResponseEntity<List> response=restTemplate.exchange(url+"getAllEmployes", HttpMethod.GET, entity, List.class);
		return response.getBody();
	}
	
	@PostMapping("/saveEmploye1")
	public Employe saveEmploye(@RequestBody Employe employe)
	{
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity <Employe> entity = new HttpEntity<>(employe,headers);
		ResponseEntity<Employe> response=restTemplate.exchange(url+"saveEmploye", HttpMethod.POST, entity, Employe.class);
		return response.getBody();
	}
	
	@DeleteMapping("/deleteById/{id}")
	public String deleteEmploye(@PathVariable int id)
	{
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity <String> entity = new HttpEntity<>(headers);
		ResponseEntity<String> response=restTemplate.exchange(url+"deleteById/"+id, HttpMethod.DELETE, entity, String.class);
		return response.getBody();
	}
	
	@PutMapping("/upDateEmploye1")
	public Employe upDateEmploye(@RequestBody Employe employe)
	{
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity <Employe> entity = new HttpEntity<>(employe,headers);
		ResponseEntity<Employe> response=restTemplate.exchange(url+"upDateEmploye", HttpMethod.PUT, entity, Employe.class);
		return response.getBody();
	}
	


}
