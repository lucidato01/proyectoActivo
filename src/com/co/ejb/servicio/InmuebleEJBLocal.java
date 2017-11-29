package com.co.ejb.servicio;

import java.util.List;

import javax.ejb.Local;

import com.co.modelo.Inmueble;
import com.co.restrespuesta.JsonInmuebleString;

@Local
public interface InmuebleEJBLocal {

	List<JsonInmuebleString> listInmuebleGeneral();
}
