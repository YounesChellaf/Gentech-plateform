package com.project2cs.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class Type {
	@Id
	@GeneratedValue()
	@Column(name = "type_id")
	private int id;
	
	@Column(name = "nom_type")
	@JsonProperty("nom_type")
	private String nomType;
	
	@Column(name = "description")
	@JsonProperty("description")
	private String description;
	
	@Column(name = "carracteristics")
	@JsonProperty("carracteristics")
	private String carracteristics;
	
	@ManyToOne(optional = false) 
    @JoinColumn(name = "categorie_id")
	@JsonProperty("categorie")
	private Categorie categorie;
	
	public Type() {
	}
	
	public Type(String nomType, String description, String carracteristics,Categorie categorie) {
		this.nomType = nomType;
		this.description = description;
		this.carracteristics = carracteristics;
		this.categorie = categorie;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNomType() {
		return nomType;
	}
	
	public void setNomType(String nomType) {
		this.nomType = nomType;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public String getCarracteristics() {
		return carracteristics;
	}
	
	public void setCarracteristics(String carracteristics) {
		this.carracteristics = carracteristics;
	}
	
}
