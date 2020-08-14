package com.groupchallenge.co2tracker.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sensor {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String name;
	private Integer co2Level;
	private Integer districtId;

	public Sensor(Integer id, String name, Integer co2Level, Integer districtId) {
		this.id = id;
		this.name = name;
		this.co2Level = co2Level;
		this.districtId = districtId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCo2Level() {
		return co2Level;
	}

	public void setCo2Level(Integer co2Level) {
		this.co2Level = co2Level;
	}

	public Integer getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}
}
