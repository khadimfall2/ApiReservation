package com.reservation.api.reservation.api.controllor;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.reservation.api.reservation.api.model.Film;
import com.reservation.api.reservation.api.service.FilmService;

@RestController
public class FilmControllor {

	@Autowired

	private FilmService filmService;

	@GetMapping("film")

	public Iterable<Film> getAllFilms() {

		return filmService.getAllFilm();

	}

	public Optional<Film> getFilmById(Integer id) {

		return filmService.getFilmById(id);
	}

	@PostMapping("/film")
	public Film postFilm(@RequestBody Film film) {
		return filmService.addFilm(film);
	}

	/**
	 * Delete - Delete an film
	 * 
	 * @param id - The id of the film to delete
	 */
	@DeleteMapping("/film/{id}")
	public void deleteFilm(@PathVariable("id") final Integer id) {

		filmService.diletFilmById(id);
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