package com.co.ejb.servicio;

import java.util.List;

import javax.ejb.Local;

import com.co.modelo.Inmueble;
import com.co.restrespuesta.JsonInmuebleString;

/**
 * Interface para realizar las operaciones de Inmueble
 * 
 * @version 1.0
 * @author Fabian
 */
@Local
public interface InmuebleEJBLocal {

	/**
	 * Metodo para listar todos los inmubles
	 * 
	 * @return List<Inmueble>
	 */
	List<JsonInmuebleString> listInmuebleGeneral();

	/**
	 * Metodo para guardar el inmueble
	 * 
	 * @param Inmueble
	 * @return String
	 */
	String guardarActivo(Inmueble inmueble);
}