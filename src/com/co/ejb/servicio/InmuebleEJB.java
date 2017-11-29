package com.co.ejb.servicio;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
 
import com.co.dao.imp.DaoActivo;
import com.co.modelo.Inmueble;
import com.co.restrespuesta.JsonInmuebleString;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Session Bean implementation class InmuebleEJB
 */
@Stateless
public class InmuebleEJB implements InmuebleEJBLocal {
 
	private DaoActivo daoActivo;

	/**
	 * Default constructor.
	 */
	public InmuebleEJB() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<JsonInmuebleString> listInmuebleGeneral() {

		List<Inmueble> listaInmueble = new ArrayList<>();
		List<JsonInmuebleString> listaJsonInmuebleString=new ArrayList<>();
		try {
			listaInmueble = daoActivo.listaActivosGeneral();
		} catch (Exception e) {
		}
		return listaJsonInmuebleString;
	}
	
	public String guardarActivo(Inmueble inmu) {
		String respuesta = "va en el servicio de la logica";

		boolean valor = false;
		// valor = crearEmpleado(empleado);

		if (!valor) {
			ObjectMapper mapper = new ObjectMapper();
			try {
				respuesta = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(inmu);
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
		} else {
			respuesta = "Error";
		}
		return respuesta+ ": exito";
	}

}
