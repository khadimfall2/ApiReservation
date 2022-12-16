package com.reservation.api.reservation.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservation.api.reservation.api.model.Billet;
import com.reservation.api.reservation.api.repository.BilletRepository;

@Service
public class BilletService {

	@Autowired
	// Methode CREAD ou lire
	private BilletRepository billetRepository;

	public Iterable<Billet> getAllBillet() {

		return billetRepository.findAll();
	}

	public Optional<Billet> getBilletById(Integer id) {

		return billetRepository.findById(id);
	}

	// Methode CREATE et UPDATE
	// Le fonctionnement des frameworks ORM est simple.
	// La création et la mise à jour d’un objet sont gérées par les mêmes méthodes
	// save(S entity) et saveAll(Iterable<S> entities).
	public Billet addBillet(Billet billet) {
		return billetRepository.save(billet);
	}

	// public Billet addAllBillet (Billet billet) {
	// return billetRepository.saveAll(null);

	// SUPPRIMER des données
	/*
	 * delete(S entity)
	 * 
	 * deleteAll()
	 * 
	 * deleteAll(Iterable<S> entities)
	 * 
	 * deleteById(Integer id)
	 *
	 */
	// DELETE ou supprumer
	public void deleteBillet(Billet billet) {
		billetRepository.delete(billet);
	}

	public void deleteAllBillet(Billet billet) {
		billetRepository.deleteAll();
	}

	public void deleteBilletById(Integer id) {
		billetRepository.deleteById(id);
	}

}