package com.manipulacion.java;

public class StringManipulatorTesting {

	public static void main(String[] args) {
		StringManipulator finalstr  = new StringManipulator();
		String str = finalstr.trimAndConcat("  hola  ", "  mundo  ");
		System.out.println(str);
		
		StringManipulator indexornull = new StringManipulator();
		int ion = indexornull.getIndexOrNull("norman pohl", 'h');
		System.out.println(ion);
		
		StringManipulator indexornull2 = new StringManipulator();
		String palabra = "los juegos del hambre";
		String subpalabra = "del";
		int a = indexornull2.getIndexOrNull(palabra, subpalabra);
		System.out.println(a);
		
		StringManipulator concatsub = new StringManipulator();
		String p1 = "spider";
		String p2 = "man";
		int num1 = 1;
		int num2 = 3;
		String resultado = concatsub.concatSubstring(p1, num1, num2, p2);
		System.out.println(resultado);
	}

}
