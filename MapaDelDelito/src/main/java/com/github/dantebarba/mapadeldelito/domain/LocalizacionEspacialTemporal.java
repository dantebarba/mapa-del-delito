
package com.github.dantebarba.mapadeldelito.domain;

import java.util.Date;

import javax.persistence.CascadeType;
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

	@OneToOne(cascade = CascadeType.ALL)
	private Geolocalizacion coordenadas;

	@Id
	@GeneratedValue
	private Long id;

	@Override
	public Long getId() {
		return this.id;
	}

	public Date getDe() {
		return de;
	}

	public void setDe(Date de) {
		this.de = de;
	}

	public Date getHasta() {
		return hasta;
	}

	public void setHasta(Date hasta) {
		this.hasta = hasta;
	}

	public Geolocalizacion getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(Geolocalizacion coordeanadas) {
		this.coordenadas = coordeanadas;
	}

}
