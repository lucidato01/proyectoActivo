package com.co.ejb.servicio;

import java.util.List;

import javax.ejb.Local;

import com.co.modelo.Persona;

/**
 * Interface para realizar las operaciones de Persona
 * 
 * @version 1.0
 * @author Fabian
 */
@Local
public interface PersonaEJBLocal {

	/**
	 * Metodo para listar todas las Personas
	 * 
	 * @return List<Persona>
	 */
	List<Persona> listPersonaGeneral();
}
