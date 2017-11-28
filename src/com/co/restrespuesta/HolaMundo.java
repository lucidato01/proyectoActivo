package com.co.restrespuesta;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/saludo")
public class HolaMundo {
	
	@GET
	@Path("/hola")
	@Produces(MediaType.TEXT_PLAIN)///sirvio sin este tambien 
	///http://localhost:8080/RestService/api/saludo/
	public String Saludar() {
		return "hola servicio restsss";
	}
	//@GET
	/*/@Path("/hola")
	@Produces(MediaType.TEXT_PLAIN)  
	//http://localhost:8080/RestService/api/saludo/hola
	public String Saludar() {
		return "hola servicio rest prodices";
	}*/

}
