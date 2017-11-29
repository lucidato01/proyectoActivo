package com.co.serviciorest;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.co.ejb.servicio.InmuebleEJB;
import com.co.ejb.servicio.InmuebleEJBLocal;
import com.co.restrespuesta.JsonInmuebleString;
import com.co.modelo.Estadoinmueble;
import com.co.modelo.Inmueble;
import com.co.modelo.Tipoinmueble;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * clase InmuebleEJBLocal para hacer la logica
 * 
 * @author Fabian
 */
@RequestScoped
@Path("/activo")
@Produces({ "application/json" })
@Consumes({ "application/json" })
public class ServicioInmueble {

	@EJB
	private InmuebleEJBLocal inmuebleEJB;

	/**
	 * Servicio con validadciones para crear el inmueble
	 * 
	 * @param String
	 * @return String
	 */
	@POST
	@Path("/crearinmueble")
	public String crearActivo(String inmuebleJsonS) {
		String respuesta = "";
		try {
			ObjectMapper mapper = new ObjectMapper();
			JsonInmuebleString inmuebleString = mapper.readValue(inmuebleJsonS, JsonInmuebleString.class);

			System.out.println("empleadoStrin " + inmuebleString.toString());

			if (inmuebleString.getNumeroInternoI() == null || inmuebleString.getNumeroInternoI().isEmpty()) {
				throw new Exception("Numero interno null o vacio");
			}
			if (inmuebleString.getIdTipo() == null || inmuebleString.getIdTipo().isEmpty()) {
				throw new Exception("Tipo inmueble null o vacio");
			}
			if (inmuebleString.getIdEstadoInmueble() == null || inmuebleString.getIdEstadoInmueble().isEmpty()) {
				throw new Exception("Estado Inmueble null o vacio");
			}
			if (inmuebleString.getSerialInmueble() == null || inmuebleString.getSerialInmueble().isEmpty()) {
				throw new Exception("Serial es null o vacio");
			}
			if (inmuebleString.getNombreInmueble() == null || inmuebleString.getNombreInmueble().isEmpty()) {
				throw new Exception("Nombre null o vacio");
			}
			if (inmuebleString.getDescripcionI() == null || inmuebleString.getDescripcionI().isEmpty()) {
				throw new Exception("Descripcion null o vacio");
			}
			if (inmuebleString.getPesoInmueble() == null || inmuebleString.getPesoInmueble().isEmpty()) {
				throw new Exception("Peso null o vacio");
			}
			if (inmuebleString.getAltoInmueble() == null || inmuebleString.getAltoInmueble().isEmpty()) {
				throw new Exception("Alto es null o vacio");
			}
			if (inmuebleString.getAnchoInmueble() == null || inmuebleString.getAnchoInmueble().isEmpty()) {
				throw new Exception("Anchp null o vacio");
			}
			if (inmuebleString.getLargoInmueble() == null || inmuebleString.getLargoInmueble().isEmpty()) {
				throw new Exception("Largo null o vacio");
			}
			if (inmuebleString.getColorInmueble() == null || inmuebleString.getColorInmueble().isEmpty()) {
				throw new Exception("Color null o vacio");
			}

			int id = Integer.parseInt(inmuebleString.getNumeroInternoI());
			float peso = Float.parseFloat(inmuebleString.getPesoInmueble());
			float alto = Float.parseFloat(inmuebleString.getAltoInmueble());
			float ancho = Float.parseFloat(inmuebleString.getAnchoInmueble());
			float largo = Float.parseFloat(inmuebleString.getLargoInmueble());
			int tipoInmuble = Integer.parseInt(inmuebleString.getIdTipo());
			int EstadoInmuble = Integer.parseInt(inmuebleString.getIdEstadoInmueble());
			Tipoinmueble tipo = new Tipoinmueble(tipoInmuble);
			Estadoinmueble estado = new Estadoinmueble(EstadoInmuble);

			Inmueble inmueble = new Inmueble(id, inmuebleString.getSerialInmueble(), inmuebleString.getNombreInmueble(),
					inmuebleString.getDescripcionI(), peso, alto, ancho, largo, inmuebleString.getColorInmueble(), tipo,
					estado);

			this.inmuebleEJB = new InmuebleEJB();
			respuesta = this.inmuebleEJB.guardarActivo(inmueble);

		} catch (Exception e) {
			e.printStackTrace();
			respuesta = e.getMessage();
		}
		return respuesta;
	}
}
