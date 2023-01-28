package com.todo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="therapie")
public class Therapie {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	
	@Column(name="nom")
	private String nom;
	

	
	@Column(name="desription")
	private String description;



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public Therapie() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Therapie(String nom, String description) {
		super();
		this.nom = nom;
		this.description = description;
	}
	

	

}