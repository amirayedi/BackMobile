package com.todo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todo.model.Therapie;



@Repository
public interface TherapieRepository extends JpaRepository<Therapie, Long>{
	
}