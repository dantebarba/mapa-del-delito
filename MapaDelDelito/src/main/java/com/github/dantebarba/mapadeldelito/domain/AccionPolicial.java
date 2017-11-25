package com.github.dantebarba.mapadeldelito.domain;

import java.io.Serializable;

import com.github.dantebarba.mapadeldelito.domain.generics.EntidadBase;

public class AccionPolicial extends EntidadBase {

	public enum Atencion911 {
		MALA, REGULAR, BUENA;
	}

	public enum Resolucion {
		MALA, REGULAR, BUENA;
	}

	private boolean presenciaPolicial = false;

	private Atencion911 atencion911 = AccionPolicial.Atencion911.MALA;

	private Integer minutosDeDemora = 0;

	private Resolucion resolucionPolicial = AccionPolicial.Resolucion.MALA;

	@Override
	public Serializable getId() {
		return null;
	}
}
