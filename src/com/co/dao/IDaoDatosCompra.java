package com.co.dao;

import java.time.LocalDate;
 

import com.co.modelo.Datoscompra;

/**
 *Interface para realizar  las operaciones de los Datos  
 *@version 1.0
 *@author Fabian
 * * */
public interface IDaoDatosCompra {
	
	/**
	 * Metodo para editar la fecha de baja
	 * @return DatosCompra 
	 * */
	 Datoscompra DatosActualizados (LocalDate fechaBaja);



}
