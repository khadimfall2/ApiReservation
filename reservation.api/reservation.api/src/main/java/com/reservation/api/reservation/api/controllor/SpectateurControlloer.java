package com.reservation.api.reservation.api.controllor;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.reservation.api.reservation.api.model.Spectateur;
import com.reservation.api.reservation.api.service.SpectateurService;

@RestController

public class SpectateurControlloer {
	
	@Autowired
	
	
	private SpectateurService spectateurService ;
	
	@GetMapping("/spectateur")
	
	public Iterable<Spectateur>getAllSpectateurs(){
		
		
		return spectateurService.getALLSpectateur();
	}
	
	@GetMapping("Spectateur")
	
	public Optional <Spectateur>GetSpectateurById(Integer id){
		
		
		return spectateurService.getSpectateurById(id);
	}
	
	@PostMapping("/spectateur")
	
	public Spectateur postSpectateur(@RequestBody Spectateur spectateur) {
		return spectateurService.addSpectateur(spectateur);
	}
	@DeleteMapping
public void DeleteSpectateurByid(@PathVariable("id") Integer id) {
	spectateurService.deleteSpectateurById(id);
	
	
}
}

/*@PostMapping("/employee")
public Employee createEmployee(@RequestBody Employee employee) {
	return employeeService.saveEmployee(employee);*/