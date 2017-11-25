package com.github.dantebarba.mapadeldelito.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.github.dantebarba.mapadeldelito.domain.generics.EntidadBase;

@Entity
public class Movilidad extends EntidadBase {
	
	@Enumerated(EnumType.STRING)
	private TipoVehiculo tipo = TipoVehiculo.SIN_DETERMINAR;
	private String patente = "";
	private String descripcion = "";
	@Id
	@GeneratedValue
	private Long id;
	
	public enum TipoVehiculo {
		SIN_DETERMINAR, AUTO, MOTO, A_PIE;
	}

	@Override
	public Long getId() {
		return this.id;
	}
}
