package com.co.restrespuesta;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/saludo")
public class HolaMundo {
	
	@GET
	@Path("/hola")
	@Produces(MediaType.TEXT_PLAIN) 
 	public String Saludar() {
		return "hola servicio rest";
	}
	 
 

}
