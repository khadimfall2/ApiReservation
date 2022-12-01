package com.reservation.api.reservation.api.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
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
@Table(name="film")
public class Film {
	
	private static final FetchType fetchTy = null;



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "film_id")
	private int filmId ;
	
    @Column(name="titre")
	private String titre ;
	@Column(name="duree")
	private String duree ;
	public int getFilmId() {
		return filmId;
	}

	@OneToMany(
   //cascade = CascadeType.ALL, 
  // orphanRemoval = true, 
   fetch = FetchType.LAZY)
	@JoinColumn (name = "film_id")
	List<Billet> billets = new ArrayList<>();
	public List<Billet> getBillets() {
		return billets;
	}
	public void setBillets(List<Billet> billets) {
		this.billets = billets;
	}

	@OneToMany(
   //cascade = CascadeType.ALL, 
   //orphanRemoval = true
			//fetch = fetchType.EAGER 
   )
	@JoinColumn(name = "film_id")
	List<Diffusion> diffusions = new ArrayList<>();
	public List<Diffusion> getDiffusions() {
		return diffusions;
	}
	public void setDiffusions(List<Diffusion> diffusions) {
		this.diffusions = diffusions;
	}
	

}
