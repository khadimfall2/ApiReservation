package com.reservation.api.reservation.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "spectateur")
@Data
public class Spectateur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "spectateur_id")
	private int spectateurId;

	@Column(name = "nom")
	private String nonSpectateur;

	@Column(name = "prenom")
	private String prenomSpectateur;

	@Column(name = "reservation_id")
	private int reservation_idSpectateur;

	@Column(name = "age")
	private int ageSpectateur;

}
