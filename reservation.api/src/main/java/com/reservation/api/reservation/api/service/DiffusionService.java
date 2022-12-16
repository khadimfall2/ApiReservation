package com.reservation.api.reservation.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservation.api.reservation.api.model.Diffusion;
import com.reservation.api.reservation.api.repository.DiffusionRepository;

@Service
public class DiffusionService {

	@Autowired
	private DiffusionRepository diffusionRepository;

	public Iterable<Diffusion> getAllDiffusion() {

		return diffusionRepository.findAll();
	}

	public Optional<Diffusion> getDiffusionById(int id) {

		return diffusionRepository.findById(id);

	}

	public Diffusion addDiffusion(Diffusion diffusion) {

		return diffusionRepository.save(diffusion);

	}

	public void deleteDiffusion(Diffusion diffusion) {
		diffusionRepository.delete(diffusion);

	}

	public void deleteDiffusionById(Integer id) {

		diffusionRepository.deleteById(id);

	}

}
