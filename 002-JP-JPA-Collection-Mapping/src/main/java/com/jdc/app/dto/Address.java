package com.jdc.app.dto;

import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class Address {
	
	private String city;
	private String state;
	private int postalCode;
	
	public Address() {
		
	}
	
	public Address(String city, String state, int postalCode) {
		super();
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, postalCode, state);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(city, other.city) && postalCode == other.postalCode && Objects.equals(state, other.state);
	}
	
	
	
	

}
