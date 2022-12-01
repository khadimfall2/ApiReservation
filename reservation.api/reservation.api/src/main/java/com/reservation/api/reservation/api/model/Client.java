package com.reservation.api.reservation.api.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
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
@Table(name="client")
public class Client {
	


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="client_id")
	private Integer clientId ;
	
	@Column(name="name")
	private String nomClient ;
	
	@Column(name="prenom")
	private String prenomClient ;
	
	
	@Column(name="age")
	private Integer ageClient ;
	
	@Column(name="email")
	private String emailClient;
	
	
	@Column(name="tel")
	private String telClient ;

	// CascadeType.All: suprime un client => suprprimer les reservations 
    // CascadeType.PERSIST suprime un client !=> suprime pas les réservation associée
	@OneToMany(
  
	//cascade = CascadeType.PERSIST,  
    // orphanRemoval = true ,             // non existence de # alos que le 1 est supprimé
    fetch = FetchType.EAGER)             // si on recupere 1 tout les # sont recuperer

	@JoinColumn(name = "client_id")
	List<Reservation> reservations = new ArrayList<>();

	public List<Reservation> getReservation() {
		return reservations;
	}

	
	
	
}
