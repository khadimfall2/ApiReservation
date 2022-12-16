package com.reservation.api.reservation.api.controllor;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.reservation.api.reservation.api.model.Reservation;
import com.reservation.api.reservation.api.service.ReservationService;

@RestController
public class ReservationControllor {

	@Autowired

	private ReservationService reservationService;

	@GetMapping("/reservation")

	public Iterable<Reservation> getAllReservations() {

		return reservationService.getAllReservation();

	}

	@GetMapping("Reservation")

	public Optional<Reservation> GetReservationById(Integer id) {

		return reservationService.getReservationById(id);
	}

	@PostMapping("/reservation")
	public Reservation postResrvation(@RequestBody Reservation reservation) {
		return reservationService.addReservation(reservation);
	}

	@DeleteMapping("/reservation/{id}")
	public void deleteReservation(@PathVariable("id") final Integer id) {

		reservationService.deleteReservationById(id);

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