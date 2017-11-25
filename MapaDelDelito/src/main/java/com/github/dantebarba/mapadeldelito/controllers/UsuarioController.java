package com.github.dantebarba.mapadeldelito.controllers;

import java.security.NoSuchAlgorithmException;

import javax.ws.rs.WebApplicationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.github.dantebarba.mapadeldelito.domain.Usuario;
import com.github.dantebarba.mapadeldelito.repositories.UsuarioRepository;
import com.github.dantebarba.mapadeldelito.support.Utils;

@Controller
public class UsuarioController {

	@Autowired
	UsuarioRepository repo;
	

	public Usuario generarUsuario(String ipAddr) {
		 String hashMd5;
		try {
			hashMd5 = Utils.genMd5(ipAddr);
		} catch (NoSuchAlgorithmException e) {
			throw new WebApplicationException(500);
		}
		// DO MD5 WITH IP ADDR
		Usuario usuario = repo.findByHashMd5(hashMd5);
		if (usuario == null) {
			usuario = new Usuario();
			usuario.setIp(ipAddr);
			usuario.setHashMd5(hashMd5);
			repo.save(usuario);
		}
		return usuario;
	}

}
