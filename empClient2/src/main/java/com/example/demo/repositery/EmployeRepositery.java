package com.example.demo.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employe;

@Repository
public interface EmployeRepositery extends CrudRepository<Employe, Integer>,JpaRepository<Employe, Integer> {

}
