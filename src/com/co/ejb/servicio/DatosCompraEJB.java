package com.co.ejb.servicio;

import java.time.LocalDate;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class DatosCompraEJB
 */
@Stateless
public class DatosCompraEJB implements DatosCompraEJBLocal {

	/**
	 * Default constructor.
	 */
	public DatosCompraEJB() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Metodo para validadr si la fecha compra es menor a la fecha de baja
	 *
	 * @param LocalDate
	 * @param LocalDate
	 * @return boolean
	 */
	@Override
	public boolean validarFechas(LocalDate fechaCompra, LocalDate FechaBaja) {
		boolean bandera = false;

		if (fechaCompra.compareTo(FechaBaja) < 0) {
			bandera = true;
		} else {
			bandera = false;
		}
		return bandera;
	}
}
