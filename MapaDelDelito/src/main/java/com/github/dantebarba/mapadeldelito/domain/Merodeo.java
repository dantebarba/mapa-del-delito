package com.github.dantebarba.mapadeldelito.domain;

import javax.persistence.Entity;

@Entity
public class Merodeo extends Delito {

	@Override
	public TipoDelito getTipoDelito() {
		// TODO Auto-generated method stub
		return TipoDelito.MERODEO;
	}

}
