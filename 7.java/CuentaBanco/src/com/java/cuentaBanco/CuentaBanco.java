package com.java.cuentaBanco;

import java.util.ArrayList;
import java.util.Collections;

public class CuentaBanco {
	private String numeroCuenta = "";
	private double saldoCuentaCorriente = 0.0;
	private double saldoCuentaAhorro = 0.0;
	private static int cuentasCreadas = 0;
	private static double dineroEnCuenta = 0.0;
	
	//metodo para crear cuenta aleatoria
	private String nuevoNumeroCuenta() {
		String numeroAleatorio ="";
		ArrayList<Character>numero = new ArrayList<Character>();
		numero.add('0');numero.add('1');numero.add('2');numero.add('3');numero.add('4');
		numero.add('5');numero.add('6');numero.add('7');numero.add('8');numero.add('9');
		Collections.shuffle(numero);
		for (int i = 0; i < numero.size(); i++) {
			
			numeroAleatorio = numeroAleatorio + numero.get(i);
		}
		
		numeroCuenta = numeroAleatorio;
		return numeroCuenta;
		
	}
	//constructor
	public CuentaBanco() {
		String numeroCuenta = nuevoNumeroCuenta();
		double saldoCuentaCorriente = 0.0;
		double saldoCuentaAhorro = 0.0;
		cuentasCreadas = cuentasCreadas + 1;
		System.out.println("nueva cuenta creada: " + numeroCuenta + ".");
		System.out.println("total de cuentas creadas: " + cuentasCreadas + ".");	
	}
	
	
	//get y set
	
	
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	public double getSaldoCuentaCorriente() {
		return saldoCuentaCorriente;
	}
	public void setSaldoCuentaCorriente(double saldoCuentaCorriente) {
		this.saldoCuentaCorriente = saldoCuentaCorriente;
	}
	public double getSaldoCuentaAhorro() {
		return saldoCuentaAhorro;
	}
	public void setSaldoCuentaAhorro(double saldoCuentaAhorro) {
		this.saldoCuentaAhorro = saldoCuentaAhorro;
	}
	
	//metodos depositar dinero
	public void deposito(String tipoCuenta, double monto) {
		if (tipoCuenta == "cuentacorriente") {
			setSaldoCuentaCorriente(getSaldoCuentaCorriente() + monto);
			dineroEnCuenta = dineroEnCuenta + monto;
		}
		
		if (tipoCuenta == "cuentaahorro") {
			setSaldoCuentaAhorro(getSaldoCuentaCorriente() + monto);
			dineroEnCuenta = dineroEnCuenta + monto;
		}
		
	}
	
	public void giro(String tipoCuenta, double monto) {
		if (tipoCuenta == "cuentacorriente") {
			if (getSaldoCuentaCorriente() < monto) {
				System.out.println("saldo insuficiente");
			} else {
				setSaldoCuentaCorriente(saldoCuentaCorriente - monto);
				dineroEnCuenta = dineroEnCuenta - monto; 
			}	
		}
		if (tipoCuenta == "cuentaahorro") {
			if (getSaldoCuentaAhorro() < monto) {
				System.out.println("saldo insuficiente");
			} else {
				setSaldoCuentaAhorro(saldoCuentaAhorro - monto);
				dineroEnCuenta = dineroEnCuenta - monto; 
			}	
		}
			
	}
	
	
	
	public double totalEnCuenta() {
		double total = saldoCuentaCorriente + saldoCuentaAhorro;
		System.out.println(total);
		return total;
	}
	
	
	
	
}
