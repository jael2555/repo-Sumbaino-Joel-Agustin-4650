package model;

import java.util.Date;

public class Prestamo {
	
	private double monto;
	private Date fecha;
	
	public Prestamo() {
		
	}

	public Prestamo(double monto, Date fecha) {
		super();
		this.monto = monto;
		this.fecha = fecha;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	

}
