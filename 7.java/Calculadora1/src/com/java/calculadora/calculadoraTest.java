package com.java.calculadora;

public class calculadoraTest {

	public static void main(String[] args) {
		Calculadora c1 = new Calculadora(10.5, 5.2, "+");
		Calculadora c2 = new Calculadora(10.5, 5.2, "-");
		
		c1.realizaOperacion();
		c2.realizaOperacion();
		
		c1.resultado();
		c2.resultado();

	}

}
