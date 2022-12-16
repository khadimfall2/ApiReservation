package com.reservation.api.reservation.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservation.api.reservation.api.model.Film;
import com.reservation.api.reservation.api.repository.FilmRepository;

@Service
public class FilmService {

	@Autowired
	private FilmRepository filmRepository;

	public Iterable<Film> getAllFilm() {

		return filmRepository.findAll();
	}

	public Optional<Film> getFilmById(int id) {
		return filmRepository.findById(id);
	}

	public Film addFilm(Film film) {
		return filmRepository.save(film);
	}

	public void deleteFilm(Film film) {

		filmRepository.delete(film);
	}

	public void diletFilmById(Integer id) {

		filmRepository.deleteById(id);
	}
}
