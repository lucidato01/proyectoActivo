package com.co.servicio;

import java.time.LocalDate;

import com.co.interfazservicio.IServicioDatosCompra;

public class SerivicioDatosCompra implements IServicioDatosCompra {

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
