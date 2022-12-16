package com.reservation.api.reservation.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "billet")

@Data
public class Billet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "billet_id")
	private Integer billetId;

	@Column(name = "film_id")
	private Integer filId;

	@Column(name = "prix")
	private Integer billet;

}
