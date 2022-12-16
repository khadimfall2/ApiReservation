package com.reservation.api.reservation.api.model;

import java.util.ArrayList;
import java.util.List;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "reservation")

public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "reservation_id")
	private Integer reservationId;

	@Column(name = "date_reservation")

	private String DateReservation;

	public String getPrixBillet() {
		return prixBillet;
	}

	public void setPrixBillet(String prixBillet) {
		this.prixBillet = prixBillet;
	}

	@Column(name = "nombre_billet")
	private Integer nombreBillet;

	@Column(name = "prix_billet")
	private String prixBillet;

	@Column(name = "nombre_place")
	private Integer nombrePlace;

	@Column(name = "client_id")
	private Integer clientId;

	@Column(name = "film_id")
	private Integer filmId;

	@OneToMany(
			// cascade = CascadeType.ALL,
			// orphanRemoval = true,
			fetch = FetchType.EAGER)
	@JoinColumn(name = "reservation_id")
	List<Spectateur> spectateurs = new ArrayList<>();

	public List<Spectateur> getSpectateurs() {
		return spectateurs;
	}

	public void setSpectateurs(List<Spectateur> spectateurs) {
		this.spectateurs = spectateurs;
	}

}
