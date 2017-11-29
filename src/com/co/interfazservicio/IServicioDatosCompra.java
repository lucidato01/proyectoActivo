package com.co.interfazservicio;

import java.time.LocalDate;

public interface IServicioDatosCompra {
	
	public boolean validarFechas (LocalDate fechaCompra, LocalDate FechaBaja);

}
