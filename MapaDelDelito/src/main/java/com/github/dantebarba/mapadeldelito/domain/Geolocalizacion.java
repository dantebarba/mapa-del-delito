package com.github.dantebarba.mapadeldelito.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.github.dantebarba.mapadeldelito.domain.generics.EntidadBase;

@Entity
public class Geolocalizacion extends EntidadBase {

	private String latitud;
	
	private String longitud;

	@Id
	@GeneratedValue
	private Long id;
	
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

}
