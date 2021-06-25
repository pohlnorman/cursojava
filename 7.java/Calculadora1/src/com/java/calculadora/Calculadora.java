package com.java.calculadora;

public class Calculadora implements java.io.Serializable{

	private double operadorUno = 0.0;
	private double operadorDos= 0.0;
	private double total = 0.0;
	private String operacion =" ";
	
	
	
	public Calculadora(double operadorUno, double operadorDos, String operacion) {
		
		this.operadorUno = operadorUno;
		this.operadorDos = operadorDos;
		this.operacion = operacion;
	}



	public Calculadora() {
	
	}



	public double getOperadorUno() {
		return operadorUno;
	}



	public void setOperadorUno(double operadorUno) {
		this.operadorUno = operadorUno;
	}



	public double getOperadorDos() {
		return operadorDos;
	}



	public void setOperadorDos(double operadorDos) {
		this.operadorDos = operadorDos;
	}



	public double getTotal() {
		return total;
	}



	public void setTotal(double total) {
		this.total = total;
	}



	public String getOperacion() {
		return operacion;
	}



	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	//metodos
	
	public void realizaOperacion() {
		if (getOperacion().equals("+")) {
			double suma = getOperadorUno() + getOperadorDos();
			setTotal(suma);
		}
		
		if (getOperacion().equals("-")) {
			double resta = getOperadorUno() - getOperadorDos();
			setTotal(resta);
		}
	}
	
	public void resultado() {
		System.out.println(getTotal());
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	

	

}
