package com.co.restrespuesta;

/**
 *
 * @author Fabian
 */
public class JsonInmuebleString {

	private String numeroInternoI;
	private String idTipo;
	private String idEstadoInmueble;
	private String serialInmueble;
	private String nombreInmueble;
	private String descripcionI;
	private String pesoInmueble;
	private String altoInmueble;
	private String anchoInmueble;
	private String largoInmueble;
	private String colorInmueble;

	/**
	 * 
	 * Constructor por defecto
	 */
	public JsonInmuebleString() {
	}

	/**
	 * constructor para inicializar atributos
	 */
	public JsonInmuebleString(String numeroInternoI, String idTipo, String idEstadoInmueble, String serialInmueble,
			String nombreInmueble, String descripcionI, String pesoInmueble, String altoInmueble, String anchoInmueble,
			String largoInmueble, String colorInmueble) {
		this.numeroInternoI = numeroInternoI;
		this.idTipo = idTipo;
		this.idEstadoInmueble = idEstadoInmueble;
		this.serialInmueble = serialInmueble;
		this.nombreInmueble = nombreInmueble;
		this.descripcionI = descripcionI;
		this.pesoInmueble = pesoInmueble;
		this.altoInmueble = altoInmueble;
		this.anchoInmueble = anchoInmueble;
		this.largoInmueble = largoInmueble;
		this.colorInmueble = colorInmueble;
	}

	public String getNumeroInternoI() {
		return numeroInternoI;
	}

	public void setNumeroInternoI(String numeroInternoI) {
		this.numeroInternoI = numeroInternoI;
	}

	public String getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(String idTipo) {
		this.idTipo = idTipo;
	}

	public String getIdEstadoInmueble() {
		return idEstadoInmueble;
	}

	public void setIdEstadoInmueble(String idEstadoInmueble) {
		this.idEstadoInmueble = idEstadoInmueble;
	}

	public String getSerialInmueble() {
		return serialInmueble;
	}

	public void setSerialInmueble(String serialInmueble) {
		this.serialInmueble = serialInmueble;
	}

	public String getNombreInmueble() {
		return nombreInmueble;
	}

	public void setNombreInmueble(String nombreInmueble) {
		this.nombreInmueble = nombreInmueble;
	}

	public String getDescripcionI() {
		return descripcionI;
	}

	public void setDescripcionI(String descripcionI) {
		this.descripcionI = descripcionI;
	}

	public String getPesoInmueble() {
		return pesoInmueble;
	}

	public void setPesoInmueble(String pesoInmueble) {
		this.pesoInmueble = pesoInmueble;
	}

	public String getAltoInmueble() {
		return altoInmueble;
	}

	public void setAltoInmueble(String altoInmueble) {
		this.altoInmueble = altoInmueble;
	}

	public String getAnchoInmueble() {
		return anchoInmueble;
	}

	public void setAnchoInmueble(String anchoInmueble) {
		this.anchoInmueble = anchoInmueble;
	}

	public String getLargoInmueble() {
		return largoInmueble;
	}

	public void setLargoInmueble(String largoInmueble) {
		this.largoInmueble = largoInmueble;
	}

	public String getColorInmueble() {
		return colorInmueble;
	}

	public void setColorInmueble(String colorInmueble) {
		this.colorInmueble = colorInmueble;
	}

	@Override
	public String toString() {
		return "JsonInmuebleString [numeroInternoI=" + numeroInternoI + ", idTipo=" + idTipo + ", idEstadoInmueble="
				+ idEstadoInmueble + ", serialInmueble=" + serialInmueble + ", nombreInmueble=" + nombreInmueble
				+ ", descripcionI=" + descripcionI + ", pesoInmueble=" + pesoInmueble + ", altoInmueble=" + altoInmueble
				+ ", anchoInmueble=" + anchoInmueble + ", largoInmueble=" + largoInmueble + ", colorInmueble="
				+ colorInmueble + "]";
	}
}
