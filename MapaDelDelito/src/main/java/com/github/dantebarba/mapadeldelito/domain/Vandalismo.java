package com.github.dantebarba.mapadeldelito.domain;

import javax.persistence.Entity;

@Entity
public class Vandalismo extends Delito {

	@Override
	public TipoDelito getTipoDelito() {
		// TODO Auto-generated method stub
		return TipoDelito.VANDALISMO;
	}

}
