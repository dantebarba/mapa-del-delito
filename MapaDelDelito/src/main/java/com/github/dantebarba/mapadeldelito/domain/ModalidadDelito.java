package com.github.dantebarba.mapadeldelito.domain;

public enum ModalidadDelito {

	ENTRADERA("Robo violento, cuando uno o varios integrantes ingresan o egresan de una propiedad."), ARREBATO(
			"Delito sin violencia. Estilo ratero."), PIRAÑA("Piraña"), MECHERO(
					"Hurto en locales sin violencia"), SIN_DETERMINAR(""), ENTRADERA_CON_SECUESTRO(
							"Entradera, que luego es seguida por toma de rehen o secuestro extorsivo."), SECUESTRO_EXPRESS(
									"Secuestro o intento de secuestro en la vía pùblica"), VEHICULO_DETENIDO(
											"Vehiculo detenido sospechosamente, sin razón aparente."), LLAMADA_SOSPECHOSA(
													"Llamadas donde se pregunta por personas que no habitan en el domicilio, o llamadas desconocidas reiteradas."), PERSONAL_SOSPECHOSO(
															"Movimiento de personas cerca de la casa de forma sospechosa. Personas con uniforme con actitud y/o solicitudes extrañas, acercandose a las casas."), PINTADAS(
																	"Pintadas en la calle."), QUEMA_COCHES(
																			""), CONSUMO_ESTUPEFACIENTES(
																					""), VENTA_ESTUPEFACIENTES(
																							""), MOTOS_VANDALICAS(
																									""), ESCRUCHE(
																											"Entrada a una vivienda, sin la presencia de los dueños, o sin que los dueños lo noten.");

	private String descripcion = "";

	ModalidadDelito(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return this.name();
	}

}
