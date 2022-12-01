package com.reservation.api.reservation.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="diffusion")
@Data
public class Diffusion {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "diffusion_id")
	private int diffusionId ;
	
	
	@Column (name="film_id")
	private int diffusionFilmId ;
	
	
	@Column(name="numero_salle")
	private int numeroSalle ;
	
	
	@Column(name="date_diffusion")
	private int dateDiffusion ;
	
	
	@Column(name="horaire_diffusion")
	private String horaireDiffusion ;
	

}
