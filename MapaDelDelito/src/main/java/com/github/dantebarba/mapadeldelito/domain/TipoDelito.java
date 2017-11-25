package com.github.dantebarba.mapadeldelito.domain;

import java.util.HashMap;
import java.util.Map;

public enum TipoDelito {

	ROBO(ModalidadDelito.ENTRADERA, ModalidadDelito.ARREBATO, ModalidadDelito.ESCRUCHE), SECUESTRO(
			ModalidadDelito.ENTRADERA_CON_SECUESTRO, ModalidadDelito.SECUESTRO_EXPRESS), MERODEO(
					ModalidadDelito.MOTOS_VANDALICAS, ModalidadDelito.CONSUMO_ESTUPEFACIENTES,
					ModalidadDelito.VENTA_ESTUPEFACIENTES), ACTITUD_SOSPECHOSA(ModalidadDelito.VEHICULO_DETENIDO,
							ModalidadDelito.LLAMADA_SOSPECHOSA, ModalidadDelito.PERSONAL_SOSPECHOSO), VANDALISMO(
									ModalidadDelito.PINTADAS, ModalidadDelito.QUEMA_COCHES);

	private ModalidadDelito[] delitos;

	TipoDelito(ModalidadDelito... delitos) {
		this.setDelitos(delitos);
	}

	public ModalidadDelito[] getDelitos() {
		return delitos;
	}

	public void setDelitos(ModalidadDelito[] delitos) {
		this.delitos = delitos;
	}

	public static Map<TipoDelito, ModalidadDelito[]> toValue() {
		Map<TipoDelito, ModalidadDelito[]> entries = new HashMap<TipoDelito, ModalidadDelito[]>();
		for (TipoDelito delitos : TipoDelito.values()) {
			entries.put(delitos, delitos.getDelitos());
		}
		return entries; // or fail
	}

}
