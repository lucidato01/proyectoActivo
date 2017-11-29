package com.co.serviciorest;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.co.ejb.servicio.PersonaEJBLocal;
import com.co.modelo.Persona;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author Fabian
 */
@RequestScoped
@Path("/persona")
@Produces({ "application/json" })
// @Consumes({ "application/xml", "application/json" })
public class ServicioListaPersona {

	@EJB
	private PersonaEJBLocal personaEJB;

	/**
	 * servicio get para listar personas
	 * 
	 * @return String
	 */
	@GET
	@Path("/people")
	@Produces({ MediaType.APPLICATION_JSON })
	public String listadoPersonas() {
		System.out.println(" inicio servicio");

		String personaString = "";
		try {
			ObjectMapper mapper = new ObjectMapper();
			List<Persona> listaPer = this.personaEJB.listPersonaGeneral();
			System.out.println(" tama;o es  " + listaPer.size());
			personaString = mapper.writeValueAsString(listaPer);
		} catch (Exception e) {
			System.out.println("Entro al catch");
			e.printStackTrace();
		}
		return personaString;
	}

}
