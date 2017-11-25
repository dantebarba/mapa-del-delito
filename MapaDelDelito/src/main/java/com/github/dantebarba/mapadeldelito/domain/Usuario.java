package com.github.dantebarba.mapadeldelito.domain;

import java.io.Serializable;

import com.github.dantebarba.mapadeldelito.domain.generics.EntidadBase;

public class Usuario extends EntidadBase {

	private String ip;
	
	/**
	 * MD5 de la IP.
	 */
	private String hashMd5;
	
	
	@Override
	public Serializable getId() {
		return null;
	}

}
