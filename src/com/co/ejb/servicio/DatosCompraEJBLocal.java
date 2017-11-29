package com.co.ejb.servicio;

import java.time.LocalDate;

import javax.ejb.Local;

/**
 * Interface para realizar las operaciones de los Datos
 * 
 * @version 1.0
 * @author Fabian
 **/

@Local
public interface DatosCompraEJBLocal {

	/**
	 * Metodo para validar si la fecha compra es precia a la fecha de baja
	 * 
	 * @return boolean
	 */
	public boolean validarFechas(LocalDate fechaCompra, LocalDate FechaBaja);

}
