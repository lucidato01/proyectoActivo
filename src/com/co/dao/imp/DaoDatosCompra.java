package com.co.dao.imp;

import java.time.LocalDate;

import org.jboss.logging.Logger;

import com.co.dao.IDaoDatosCompra;
import com.co.modelo.Datoscompra;

/**
 *
 * @author Fabian
 */
public class DaoDatosCompra implements IDaoDatosCompra {

	private Logger logger = Logger.getLogger(DaoActivo.class.getName());

	@Override
	public Datoscompra DatosActualizados(LocalDate fechaBaja) {
		// TODO Auto-generated method stub
		return null;
	}

	public DaoDatosCompra() {
		logger.info("Inicia Dao DatosCOmpra");

	}

}
