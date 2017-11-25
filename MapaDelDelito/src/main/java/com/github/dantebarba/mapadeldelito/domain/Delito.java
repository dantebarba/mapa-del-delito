package com.github.dantebarba.mapadeldelito.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.github.dantebarba.mapadeldelito.domain.generics.EntidadBase;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Delito extends EntidadBase {

	@Id
	@GeneratedValue
	private Long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaDenuncia;
	
	@Enumerated(EnumType.STRING)
	private ModalidadDelito modalidadDelito;
	
	private String descripcion;
	
	@OneToOne
	private LocalizacionEspacialTemporal localizacion;
	
	private Integer cantidadDelincuentes;
	@Enumerated(EnumType.STRING)
	private Arma arma;
	
	private boolean hechoConsumado = true;
	
	@OneToOne
	private Movilidad movilidad;
	
	@ManyToOne
	private Usuario denunciante;
	
	/**
	 * Hora + IP de usuario.
	 */
	private String hashMd5;
	
	@OneToOne
	private AccionPolicial accionPolicial;
	@Enumerated(EnumType.STRING)
	private ViolenciaEjercida violenciaEjercida = ViolenciaEjercida.SIN_DETERMINAR;
	
	

	@Override
	public Long getId() {
		return this.id;
	}
	
	public abstract TipoDelito getTipoDelito();

	public String getHashMd5() {
		return hashMd5;
	}

	public void setHashMd5(String hashMd5) {
		this.hashMd5 = hashMd5;
	}

	public Usuario getDenunciante() {
		return denunciante;
	}

	public void setDenunciante(Usuario denunciante) {
		this.denunciante = denunciante;
	}

	public ViolenciaEjercida getViolenciaEjercida() {
		return violenciaEjercida;
	}

	public void setViolenciaEjercida(ViolenciaEjercida violenciaEjercida) {
		this.violenciaEjercida = violenciaEjercida;
	}

	public boolean isHechoConsumado() {
		return hechoConsumado;
	}

	public void setHechoConsumado(boolean hechoConsumado) {
		this.hechoConsumado = hechoConsumado;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public Integer getCantidadDelincuentes() {
		return cantidadDelincuentes;
	}

	public void setCantidadDelincuentes(Integer cantidadDelincuentes) {
		this.cantidadDelincuentes = cantidadDelincuentes;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public ModalidadDelito getModalidadDelito() {
		return modalidadDelito;
	}

	public void setModalidadDelito(ModalidadDelito modalidadDelito) {
		this.modalidadDelito = modalidadDelito;
	}

	public Date getFechaDenuncia() {
		return fechaDenuncia;
	}

	public void setFechaDenuncia(Date fechaDenuncia) {
		this.fechaDenuncia = fechaDenuncia;
	}

	
}
