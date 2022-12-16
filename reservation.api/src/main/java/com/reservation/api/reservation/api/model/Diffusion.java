package com.reservation.api.reservation.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "diffusion")

public class Diffusion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "diffusion_id")
	private Integer diffusionId;

	@Column(name = "film_id")
	private Integer diffusionFilmId;

	@Column(name = "numero_salle")
	private Integer numeroSalle;

	@Column(name = "date_diffusion")
	private Integer dateDiffusion;

	@Column(name = "horaire_diffusion")
	private String horaireDiffusion;

}
