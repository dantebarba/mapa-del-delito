package com.github.dantebarba.mapadeldelito.controllers;

import java.security.NoSuchAlgorithmException;

import javax.ws.rs.WebApplicationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;

import com.github.dantebarba.mapadeldelito.domain.Delito;
import com.github.dantebarba.mapadeldelito.repositories.DelitoRepository;
import com.github.dantebarba.mapadeldelito.support.Utils;

@Controller
public class DelitoController {

	@Autowired
	UsuarioController usuarioController;

	@Autowired
	DelitoRepository repo;

	public void create(Delito unDelito, String ipAddr) {
		unDelito.setDenunciante(usuarioController.generarUsuario(ipAddr));
		genMd5(unDelito);
		repo.save(unDelito);
	}

	private void genMd5(Delito unDelito) {
		try {
			unDelito.setHashMd5(Utils.genMd5((unDelito.getDenunciante().getIp() + System.currentTimeMillis())));
		} catch (NoSuchAlgorithmException e) {
			throw new WebApplicationException(500);
		}
	}

	public Delito find(String md5hash) {
		return repo.findByHashMd5(md5hash);
	}

	public Page<Delito> findAll(PageRequest page) {
		return repo.findAll(page);
	}

	public void delete(String md5Hash) {
		Delito delito = repo.findByHashMd5(md5Hash);

		Assert.notNull(delito, "Delito no encontrado");

		repo.delete(delito);
	}

}
