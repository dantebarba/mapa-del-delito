package com.github.dantebarba.mapadeldelito.api;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.dantebarba.mapadeldelito.controllers.DelitoController;
import com.github.dantebarba.mapadeldelito.domain.ActitudSospechosa;
import com.github.dantebarba.mapadeldelito.domain.Delito;
import com.github.dantebarba.mapadeldelito.domain.Merodeo;
import com.github.dantebarba.mapadeldelito.domain.Robo;
import com.github.dantebarba.mapadeldelito.domain.Secuestro;

@Component
@Path("/api/delito")
public class DelitoApi {

	@Autowired
	DelitoController delitoController;

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public String listarDelitos(@QueryParam("from") Integer from, @QueryParam("size") Integer size) {
		return "Hello world!";
	}

	@GET
	@Path("/{hashmd5}")
	@Produces(MediaType.APPLICATION_JSON)
	public String recuperarDelito(@PathParam("hashmd5") String hashmd5) {
		return hashmd5;

	}

	@POST
	@Path("/robo")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response crearRobo(@Context HttpServletRequest req, Robo unRobo) {
		this.create(unRobo, req.getRemoteAddr());
		return Response.ok().build();

	}

	@POST
	@Path("/secuestro")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response crearSecuestro(@Context HttpServletRequest req, Secuestro unSecuestro) {
		this.create(unSecuestro, req.getRemoteAddr());
		return Response.ok().build();

	}

	@POST
	@Path("/actitudSospechosa")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response crearActitudSospechosa(@Context HttpServletRequest req, ActitudSospechosa unaActitudSospechosa) {
		this.create(unaActitudSospechosa, req.getRemoteAddr());
		return Response.ok().build();

	}

	@POST
	@Path("/merodeo")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response crearMerodeo(@Context HttpServletRequest req, Merodeo unMerodeo) {
		this.create(unMerodeo, req.getRemoteAddr());
		return Response.ok().build();
	}

	public void create(Delito unDelito, String ipAddr) {
		delitoController.create(unDelito, ipAddr);
	}

	@DELETE
	@Path("/{hashmd5}")
	public Response borrarDelito(@PathParam("hashmd5") Long idDelito) {
		return null;
	}
}
