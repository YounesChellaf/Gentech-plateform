package com.project2cs.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class Localisation {
	@Id
	@GeneratedValue()
	@Column(name = "localisation_id")
	private int id;
	
	//@Column(name = "ressource_id")
	//@JsonProperty("ressource_id")
	//private int ressourceId;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "ressource_id")
	@JsonProperty("ressource")
	private Ressource ressource;
	
	@Column(name = "region")
	@JsonProperty("region")
	private String region;
	
	@Column(name = "ville")
	@JsonProperty("ville")
	private String ville;
	
	@Column(name = "pays")
	@JsonProperty("pays")
	private String pays;
	
	@Column(name = "longitude")
	@JsonProperty("longitude")
	private double longitude;
	
	@Column(name = "latitude")
	@JsonProperty("latitude")
	private double latitude;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public Localisation() {
		super();
	}

	public Localisation(String region, String ville, String pays, double longitude, double latitude) {
		super();
		this.region = region;
		this.ville = ville;
		this.pays = pays;
		this.longitude = longitude;
		this.latitude = latitude;
	}
	
	
}
