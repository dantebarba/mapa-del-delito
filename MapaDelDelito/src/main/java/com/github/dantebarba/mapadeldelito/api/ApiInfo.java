package com.github.dantebarba.mapadeldelito.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.github.dantebarba.mapadeldelito.domain.Arma;
import com.github.dantebarba.mapadeldelito.domain.Movilidad.TipoVehiculo;
import com.github.dantebarba.mapadeldelito.domain.TipoDelito;
import com.github.dantebarba.mapadeldelito.domain.ViolenciaEjercida;
import com.github.dantebarba.mapadeldelito.domain.AccionPolicial.Atencion911;
import com.github.dantebarba.mapadeldelito.domain.AccionPolicial.Resolucion;

@Component
@Path("/api")
public class ApiInfo {

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public String info() {
		return "API Running. See docs for detail.";
	}

	@GET
	@Path("/vehiculos")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getVehiculos() {
		return Response.ok(TipoVehiculo.values()).build();
	}

	@GET
	@Path("/tiposDelito")
	@Produces(MediaType.APPLICATION_JSON)
	public Response tipoDelito() {
		return Response.ok(TipoDelito.toValue()).build();
	}

	@GET
	@Path("/armas")
	@Produces(MediaType.APPLICATION_JSON)
	public Response armas() {
		return Response.ok(Arma.values()).build();
	}

	@GET
	@Path("/tiposViolencia")
	@Produces(MediaType.APPLICATION_JSON)
	public Response tiposViolencia() {
		return Response.ok(ViolenciaEjercida.values()).build();
	}

	@GET
	@Path("/atencion911")
	@Produces(MediaType.APPLICATION_JSON)
	public Response tiposAtencion911() {
		return Response.ok(Atencion911.values()).build();
	}

	@GET
	@Path("/resoluciones")
	@Produces(MediaType.APPLICATION_JSON)
	public Response resoluciones() {
		return Response.ok(Resolucion.values()).build();
	}

}
