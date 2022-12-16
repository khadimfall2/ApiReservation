package com.reservation.api.reservation.api.controllor;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.reservation.api.reservation.api.model.Billet;
import com.reservation.api.reservation.api.service.BilletService;

@RestController
public class BilletController {

	@Autowired

	private BilletService billetService;

	@GetMapping("/billet")
	public Iterable<Billet> getBillets() {

		return billetService.getAllBillet(); //

	}

	@GetMapping("/billet/{id}")
	public Optional<Billet> getBilletId(@PathVariable Integer id) {

		return this.billetService.getBilletById(id);

	}

	@PostMapping("/billet")

	public Billet postBillets(@RequestBody Billet billet) { //
		return billetService.addBillet(billet); //
	}

	/**
	 * Delete - Delete an employee
	 * 
	 * @param id - The id of the employee to delete
	 */
	@DeleteMapping("/billet/{id}")
	public void deleteBillet(@PathVariable("id") final Integer id) {

		billetService.deleteBilletById(id);
	}

}
