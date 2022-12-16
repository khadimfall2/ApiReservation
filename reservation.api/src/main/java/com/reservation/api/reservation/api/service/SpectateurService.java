package com.reservation.api.reservation.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservation.api.reservation.api.model.Spectateur;
import com.reservation.api.reservation.api.repository.SpectateurRepository;

@Service

public class SpectateurService {

	@Autowired
	private SpectateurRepository spectateurRepository;

	public Iterable<Spectateur> getALLSpectateur() {
		return spectateurRepository.findAll();

	}

	public Optional<Spectateur> getSpectateurById(Integer id) {

		return spectateurRepository.findById(id);
	}

	public Spectateur addSpectateur(Spectateur spectateur) {

		return spectateurRepository.save(spectateur);

	}

	public void deleteSpectateur(Spectateur spectateur) {

		spectateurRepository.delete(spectateur);

	}

	public void deleteSpectateurById(Integer id) {
		spectateurRepository.deleteById(id);
	}
}
