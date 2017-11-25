package com.github.dantebarba.mapadeldelito.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.github.dantebarba.mapadeldelito.domain.generics.EntidadBase;

@Entity
public class AccionPolicial extends EntidadBase {

	public enum Atencion911 {
		MALA, REGULAR, BUENA;
	}

	public enum Resolucion {
		MALA, REGULAR, BUENA;
	}

	private boolean presenciaPolicial = false;
	@Enumerated(EnumType.STRING)
	private Atencion911 atencion911 = AccionPolicial.Atencion911.MALA;

	private Integer minutosDeDemora = 0;
	
	@Enumerated(EnumType.STRING)
	private Resolucion resolucionPolicial = AccionPolicial.Resolucion.MALA;

	@Id
	@GeneratedValue
	private Long id;

	@Override
	public Long getId() {
		return this.id;
	}
}
