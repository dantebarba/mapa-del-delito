
package com.github.dantebarba.mapadeldelito.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.github.dantebarba.mapadeldelito.domain.generics.EntidadBase;

@Entity
public class LocalizacionEspacialTemporal extends EntidadBase {

	@Temporal(TemporalType.TIMESTAMP)
	private Date de;
	@Temporal(TemporalType.TIMESTAMP)
	private Date hasta;

	@OneToOne
	private Geolocalizacion coordeanadas;

	@Id
	@GeneratedValue
	private Long id;

	@Override
	public Long getId() {
		return this.id;
	}

}
