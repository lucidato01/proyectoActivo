package com.co.ejb.servicio;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.co.dao.IDaoPersona;
import com.co.dao.imp.DaoPersona;
import com.co.modelo.Persona;

/**
 * Session Bean implementation class PersonaEJB
 */
@Stateless
public class PersonaEJB implements PersonaEJBLocal {

	private DaoPersona daoPersona;

	/**
	 * Default constructor.
	 */
	public PersonaEJB() {
		daoPersona = new DaoPersona();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Persona> listPersonaGeneral() {
		System.out.println("entro al ejb");

		List<Persona> listaPersona = new ArrayList<>();

		try {
			listaPersona = this.daoPersona.listaPersona();
		} catch (Exception e) {
			System.out.println("error EJB ");
			e.printStackTrace();
		}
		return listaPersona;
	}

}
