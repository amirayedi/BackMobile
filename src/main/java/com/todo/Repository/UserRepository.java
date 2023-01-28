package com.todo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todo.model.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	public User findByEmailAndPassword(String email , String password);
	//public User findByEmail(String email);
	public User getByEmailAndPassword(String email , String password);
	public Optional<User> findByEmail(String email);

}