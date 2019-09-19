package com.project2cs.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.sql.Date;


@Entity
public class Ressource {
	@Id
	@GeneratedValue
	@Column(name="ressource_id")
	private int id;
	
	@Column(name = "nom")
	@JsonProperty("nom")
	private String nom;


	@ManyToOne(optional = false) 
    @JoinColumn(name = "type_id")
	@JsonProperty("type")
	private Type type;
	
	@Column(name = "date")
	@JsonProperty("date")
	private Date date;
	
	@Column(name = "origine_isolation")
	@JsonProperty("origine_isolation")
	private String origineIsolation;
	
	@Column(name = "etat")
	@JsonProperty("etat")
	private String etat;
	
	@Column(name = "temp_min")
	@JsonProperty("temp_min")
	private int tempMin;
	
	@Column(name = "temp_max")
	@JsonProperty("temp_max")
	private int tempMax;
	
	@Column(name = "temp_opt")
	@JsonProperty("temp_opt")
	private int tempOpt;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getOrigineIsolation() {
		return origineIsolation;
	}
	public void setOrigineIsolation(String origineIsolation) {
		this.origineIsolation = origineIsolation;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public int getTempMin() {
		return tempMin;
	}
	public void setTempMin(int tempMin) {
		this.tempMin = tempMin;
	}
	public int getTempMax() {
		return tempMax;
	}
	public void setTempMax(int tempMax) {
		this.tempMax = tempMax;
	}
	public int getTempOpt() {
		return tempOpt;
	}
	public void setTempOpt(int tempOpt) {
		this.tempOpt = tempOpt;
	}
	public Ressource(String nom, Type type, Date date, String origineIsolation, String etat, int tempMin, int tempMax,
			int tempOpt) {
		this.id = id;
		this.nom = nom;
		this.type = type;
		this.date = date;
		this.origineIsolation = origineIsolation;
		this.etat = etat;
		this.tempMin = tempMin;
		this.tempMax = tempMax;
		this.tempOpt = tempOpt;
	}
	public Ressource() {
	}
	
	
}
