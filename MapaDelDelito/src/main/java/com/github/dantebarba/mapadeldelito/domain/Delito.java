package com.github.dantebarba.mapadeldelito.domain;

import java.util.Date;

import com.github.dantebarba.mapadeldelito.domain.generics.EntidadBase;

public class Delito extends EntidadBase {

	private Long id;
	
	private Date fechaDenuncia;
	
	private TipoDelito tipoDelito;
	
	private ModalidadDelito modalidadDelito;
	
	private String descripcion;
	
	private LocalizacionEspacialTemporal localizacion;
	
	private Integer cantidadDelincuentes;
	
	private Arma arma;
	
	private boolean hechoConsumado = true;
	
	private Movilidad movilidad = Movilidad.SIN_DETERMINAR;
	
	private Usuario denunciante;
	
	/**
	 * Hora + IP de usuario.
	 */
	private String hashMd5;
	
	private AccionPolicial accionPolicial;
	
	private ViolenciaEjercida violenciaEjercida = ViolenciaEjercida.SIN_DETERMINAR;
	
	

	@Override
	public Long getId() {
		return this.id;
	}

	
}
