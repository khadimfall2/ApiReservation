package com.reservation.api.reservation.api.controllor;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.reservation.api.reservation.api.model.Client;
import com.reservation.api.reservation.api.model.Diffusion;
import com.reservation.api.reservation.api.service.DiffusionService;

@RestController
public class DiffusionController {

	@Autowired

	private DiffusionService diffusionService;

	@GetMapping("/diffusion")
	public Iterable<Diffusion> getAllDiffusions() {

		return diffusionService.getAllDiffusion();

	}

	@GetMapping("/diffusion/{id}")

	public Optional<Diffusion> getDiffusionById(@PathVariable Integer id) {

		return this.diffusionService.getDiffusionById(id);
	}

	@PostMapping("/client")

	public Diffusion postClient(@RequestBody Diffusion diffusion) {

		return diffusionService.addDiffusion(diffusion);

	}

	/**
	 * Delete - Delete an employee
	 * 
	 * @param id - The id of the employee to delete
	 */

	@DeleteMapping("/diffusion {id}")
	public void deletDiffusion(@PathVariable("id") Integer id) {
		diffusionService.deleteDiffusionById(id);
	}
}
/**
 * Delete - Delete an employee
 * 
 * @param id - The id of the employee to delete
 */
/*
 * @DeleteMapping("/employee/{id}") public void
 * deleteEmployee(@PathVariable("id") final Long id) {
 * employeeService.deleteEmployee(id);
 */