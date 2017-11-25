package com.github.dantebarba.mapadeldelito.domain;

public enum TipoDelito {

	ROBO(ModalidadDelito.ENTRADERA, ModalidadDelito.ARREBATO, ModalidadDelito.ESCRUCHE), SECUESTRO(ModalidadDelito.ENTRADERA_CON_SECUESTRO,
			ModalidadDelito.SECUESTRO_EXPRESS), MERODEO(ModalidadDelito.MOTOS_VANDALICAS,
					ModalidadDelito.CONSUMO_ESTUPEFACIENTES, ModalidadDelito.VENTA_ESTUPEFACIENTES), ACTITUD_SOSPECHOSA(
							ModalidadDelito.VEHICULO_DETENIDO, ModalidadDelito.LLAMADA_SOSPECHOSA,
							ModalidadDelito.PERSONAL_SOSPECHOSO), VANDALISMO(ModalidadDelito.PINTADAS,
									ModalidadDelito.QUEMA_COCHES);

	private ModalidadDelito[] delitos;

	TipoDelito(ModalidadDelito... delitos) {
		this.delitos = delitos;
	}

}
