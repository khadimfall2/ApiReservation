package com.reservation.api.reservation.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservation.api.reservation.api.model.Diffusion;
import com.reservation.api.reservation.api.repository.DiffusionRepository;

@Service
public class DiffusionService {
	
	@Autowired
	private DiffusionRepository diffusionrepository ;
	
	public Iterable <Diffusion> getAllDiffusion(){
		
		return diffusionrepository.findAll();
	}
	
	public Optional <Diffusion> getDiffusionById(int id){
		
		return diffusionrepository.findById(id);
		
	}

	public Diffusion addDiffusion ( Diffusion diffusion) {
		
		return diffusionrepository.save(diffusion);
	}
	public void deleteDiffusion(Diffusion diffusion) {
		diffusionrepository.delete(diffusion);
		
	}
	
	public void deleteDiffusionById(Integer id) {
		
		diffusionrepository.deleteById(id);
			
	}
	
}
