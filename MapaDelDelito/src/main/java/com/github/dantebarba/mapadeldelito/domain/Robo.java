package com.github.dantebarba.mapadeldelito.domain;

import javax.persistence.Entity;

@Entity
public class Robo extends Delito {

	@Override
	public TipoDelito getTipoDelito() {
		return TipoDelito.ROBO;
	}

}
