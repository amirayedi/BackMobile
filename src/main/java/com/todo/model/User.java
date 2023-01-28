package com.todo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="user")
public class User {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="prenom")
	private String prenom;
	
	@Column(name="age")
	private long age;
	
	@Column(name="telephone")
	private String telephone;
	
	@Column(name="role")
	private String role;
	
	/*public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}*/
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}


	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String email, String password, String nom, String prenom, long age, String telephone, String role) {
		super();
		this.email = email;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.telephone = telephone;
		this.role = role;
	}
}	

