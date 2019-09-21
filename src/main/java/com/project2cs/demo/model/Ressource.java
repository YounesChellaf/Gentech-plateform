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

	@Column(name = "description")
	@JsonProperty("description")
	private String description;

	@Column(name = "carracteristics")
	@JsonProperty("carracteristics")
	private String carracteristics;

	@ManyToOne(optional = false) 
    @JoinColumn(name = "type_id")
	@JsonProperty("type")
	private Type type;

	@ManyToOne(optional = false)
	@JoinColumn(name = "file_id")
	@JsonProperty("file")
	private FileModel file;

	@ManyToOne(optional = false)
	@JoinColumn(name = "institution_id")
	@JsonProperty("institution")
	private Institution institution;

//	@ManyToOne(optional = false)
//	@JoinColumn(name = "user_id")
//	@JsonProperty("user_id")
//	private Utilisateur user;
	
	@Column(name = "date")
	@JsonProperty("date")
	private String date;

	
	@Column(name = "etat")
	@JsonProperty("etat")
	private String etat;


	public FileModel getFile() {
		return file;
	}
	public void setFile(FileModel file) {
		this.file = file;
	}
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Institution getInstitution() {
		return institution;
	}

	public void setInstitution(Institution institution) {
		this.institution = institution;
	}

	public String getCarracteristics() {
		return carracteristics;
	}

	public void setCarracteristics(String carracteristics) {
		this.carracteristics = carracteristics;
	}

	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}

//	public Utilisateur getUser() {
//		return user;
//	}
//
//	public void setUser(Utilisateur user) {
//		this.user = user;
//	}


	public Ressource(String nom,Type type,String date, String etat,String description,String carracteristics,FileModel file,Institution institution) {
		this.nom = nom;
		this.type = type;
		this.date = date;
		this.etat = etat;
		this.carracteristics= carracteristics;
		this.description = description;
		this.file = file;
		this.institution = institution;
	}

	protected Ressource(){
	};

	
	
}
