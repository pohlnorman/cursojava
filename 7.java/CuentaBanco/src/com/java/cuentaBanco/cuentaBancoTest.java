package com.java.cuentaBanco;



public class cuentaBancoTest {

	public static void main(String[] args) {
	CuentaBanco cliente1 = new CuentaBanco();
	CuentaBanco cliente2 = new CuentaBanco();
	
	cliente1.deposito("cuentacorriente", 10);
	cliente1.giro("cuentacorriente", 9);
	cliente1.totalEnCuenta();
	
	cliente2.deposito("cuentaahorro", 100);
	cliente2.giro("cuentaahorro", 20);
	cliente2.totalEnCuenta();
	
	
	
	
	
	
	
	

	}

}
