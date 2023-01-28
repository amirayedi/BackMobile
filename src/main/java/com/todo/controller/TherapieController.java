package com.todo.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.Repository.TherapieRepository;
import com.todo.exception.ResourceNotFoundException;
import com.todo.model.Therapie;



@RestController
@RequestMapping("/therapie/")
public class TherapieController {
	
	@Autowired
	private TherapieRepository therapieRepository;
	public int d;
	
	
	
	@GetMapping("/getAll")
	public List<Therapie> getAllTherapie(){
		return therapieRepository.findAll();
	}
	

	@PostMapping("/createTherapie")
	public Therapie createTherapie(@RequestBody Therapie therapie) {
		return therapieRepository.save(therapie);
	}
	
	
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Therapie> getTherapieById(@PathVariable Long id){
		Therapie therapie = therapieRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException ("Therapie non trouvé avec l'id :"+id));
		return ResponseEntity.ok(therapie);
	}
	
	

	@PutMapping("/update/{id}")
	public ResponseEntity<Therapie> updateTherapie(@PathVariable Long id,@RequestBody Therapie therapieInfo){
		Therapie therapie = therapieRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException ("Therapie non trouvé avec l'id :"+id));
		therapie.setNom(therapieInfo.getNom());
		therapie.setDescription(therapieInfo.getDescription());
		Therapie therapieAjour = therapieRepository.save(therapie);
		return ResponseEntity.ok(therapieAjour);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Map<String,Boolean>> deleteMedecin(@PathVariable Long id){
		
		Therapie therapie = therapieRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException ("Thérapie non trouvé avec l'id :"+id));
		therapieRepository.delete(therapie);
		//retourne void c'est pour cela qu'on a créer the map pour retourner une réponse
		
		Map<String,Boolean>  rep = new HashMap<>();
		rep.put("deleted",Boolean.TRUE);
		return ResponseEntity.ok(rep);
		
	}
	
	
	
	


	
	
}
