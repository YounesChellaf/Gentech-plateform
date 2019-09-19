package com.project2cs.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Categorie {
	@Id
	@GeneratedValue()
	@Column(name = "categorie_id")
	private int id;
	
	@Column(name = "nom_categorie")
	@JsonProperty("nom_categorie")
	private String nomCategorie;
	
	@Column(name = "description")
	@JsonProperty("description")
	private String description;
	
	@Column(name = "carracteristics")
	@JsonProperty("carracteristics")
	private String carracteristics;

	public Categorie(String nomCategorie, String description, String carracteristics) {
		super();
		this.nomCategorie = nomCategorie;
		this.description = description;
		this.carracteristics = carracteristics;
	}

	public Categorie() {
		super();
	}

	public String getNomCategorie() {
		return nomCategorie;
	}

	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCarracteristics() {
		return carracteristics;
	}

	public void setCarracteristics(String carracteristics) {
		this.carracteristics = carracteristics;
	}

	public int getId() {
		return id;
	}
	
	
	
}
