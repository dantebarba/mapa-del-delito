package com.github.dantebarba.mapadeldelito.domain;

import java.io.Serializable;
import java.util.Date;

import com.github.dantebarba.mapadeldelito.domain.generics.EntidadBase;

public class LocalizacionEspacialTemporal extends EntidadBase {

	private Date de;
	
	private Date hasta;
	
	private Geolocalizacion coordeanadas;
	
	@Override
	public Serializable getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
