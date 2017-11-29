package com.co.restrespuesta;

public class JsonDatosCompraString {
	
	private String idDC;
	private String numeroInternoI; 
	private String valorCompra; 
	private String fechaCompra; 
	private String fechaDebaja;
	
	public JsonDatosCompraString() {
		
	}
	
	public JsonDatosCompraString(String idDC, String numeroInternoI, String valorCompra, String fechaCompra,
			String fechaDebaja) {
		super();
		this.idDC = idDC;
		this.numeroInternoI = numeroInternoI;
		this.valorCompra = valorCompra;
		this.fechaCompra = fechaCompra;
		this.fechaDebaja = fechaDebaja;
	}

	public String getIdDC() {
		return idDC;
	}

	public void setIdDC(String idDC) {
		this.idDC = idDC;
	}

	public String getNumeroInternoI() {
		return numeroInternoI;
	}

	public void setNumeroInternoI(String numeroInternoI) {
		this.numeroInternoI = numeroInternoI;
	}

	public String getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(String valorCompra) {
		this.valorCompra = valorCompra;
	}

	public String getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public String getFechaDebaja() {
		return fechaDebaja;
	}

	public void setFechaDebaja(String fechaDebaja) {
		this.fechaDebaja = fechaDebaja;
	}

	@Override
	public String toString() {
		return "JsonDatosCompraString [idDC=" + idDC + ", numeroInternoI=" + numeroInternoI + ", valorCompra="
				+ valorCompra + ", fechaCompra=" + fechaCompra + ", fechaDebaja=" + fechaDebaja + "]";
	} 
	

}
