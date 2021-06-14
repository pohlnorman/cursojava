package com.manipulacion.java;

public class StringManipulator {
	public String trimAndConcat(String a, String b) {
		String palabra = a.trim() +b.trim() ;
		return palabra;
	}
	
	public int getIndexOrNull(String a, char b) {
		int valor = a.indexOf(b);
		return valor;
	}
	
	public int getIndexOrNull(String str, String substr) {
		int valor = str.indexOf(substr);
		return valor;
		
	}
	
	public String concatSubstring(String str1 , int inico, int fin, String str2) {
		String str3 = str1.substring(inico,fin);
		String sfinal = str3 + str2;
		return sfinal;
		
	}

}
