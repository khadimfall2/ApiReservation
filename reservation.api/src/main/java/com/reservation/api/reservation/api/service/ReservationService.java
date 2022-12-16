package com.reservation.api.reservation.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservation.api.reservation.api.model.Reservation;
import com.reservation.api.reservation.api.repository.ReservationReposirory;

@Service
public class ReservationService {

	@Autowired
	private ReservationReposirory reservationRepository;

	public Iterable<Reservation> getAllReservation() {

		return reservationRepository.findAll();

	}

	public Optional<Reservation> getReservationById(Integer id) {
		return reservationRepository.findById(id);
	}

	public Reservation addReservation(Reservation reservation) {

		return reservationRepository.save(reservation);
	}

	public void deliteReservation(Reservation reservation) {
		reservationRepository.delete(reservation);
	}

	public void deleteReservationById(Integer id) {

		reservationRepository.deleteById(id);
	}
}
