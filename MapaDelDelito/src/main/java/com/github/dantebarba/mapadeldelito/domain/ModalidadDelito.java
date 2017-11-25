package com.github.dantebarba.mapadeldelito.domain;

public enum ModalidadDelito {

	ENTRADERA, ARREBATO, PIRAÑA, MECHERO, SIN_DETERMINAR, ENTRADERA_CON_SECUESTRO, SECUESTRO_EXPRESS, VEHICULO_DETENIDO, LLAMADA_SOSPECHOSA, PERSONAL_SOSPECHOSO, PINTADAS, QUEMA_COCHES, CONSUMO_ESTUPEFACIENTES, VENTA_ESTUPEFACIENTES, MOTOS_VANDALICAS, ESCRUCHE;

	private String nombreComun;
	private String descripcion;
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getNombreComun() {
		return nombreComun;
	}
	public void setNombreComun(String nombreComun) {
		this.nombreComun = nombreComun;
	}
	
}
