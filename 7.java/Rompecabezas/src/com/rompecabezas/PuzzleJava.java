package com.rompecabezas;

import java.util.ArrayList;
import java.util.Arrays;

public class PuzzleJava {
//ejercicio 1
	public ArrayList<Integer> suma(ArrayList<Integer>numeros) {
		
		ArrayList<Integer> mayores = new ArrayList<Integer>();
		int suma=0;
		
		for (int i = 0; i < numeros.size(); i++) {
			suma = suma + numeros.get(i);
		}
		System.out.println(suma);
		
		for (int i = 0; i < numeros.size(); i++) {
			if(numeros.get(i) > 10) {
				mayores.add(numeros.get(i));
			}
		}
		return mayores;
	}

// ejercicio 2
	public ArrayList<String> mezcla(ArrayList<String>nombres){
		ArrayList<String> caracteres = new ArrayList<String>();
		
		for (int i = 0; i < nombres.size(); i++) {
			
			if(nombres.get(i).length() > 5) {
				caracteres.add(nombres.get(i));
			}
		}
		System.out.println(nombres);
		
		return caracteres;
		
	}
	
//ejercicio 3
	public ArrayList<Character> mezclaletras(ArrayList<Character>letras){
		
		for (int i = 0; i < letras.size(); i++) {
			if(i==0) {
				if(letras.get(i) == 'a' || letras.get(i) == 'e' || letras.get(i) == 'i' ||letras.get(i) == 'o' || letras.get(i) == 'u' ) {
					System.out.println("la primera letra es una vocal");
				}else {
					System.out.println(letras.get(i));
				}
			}
			if(i==25) {
				System.out.println(letras.get(i));
			}
		}
		
		
		return letras;
		
	}
	
//ejercico 4
	
	public ArrayList<Integer> aleatorio(ArrayList<Integer> random) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		for (int i = 0; i < random.size(); i++) {
			num.add(random.get(i));
		}
		return num;
		
	}
	
//ejercicio 5
	
	public ArrayList<Integer> aleordenado(ArrayList<Integer> ordenado){
		ArrayList<Integer> arreglo = new ArrayList<Integer>();
		
		for (int i = 0; i < ordenado.size(); i++) {
			arreglo.add(ordenado.get(i));
		}
		System.out.println("hola");
		return arreglo;
		
	}
	//ejercicio 6
	
	public ArrayList<Character> cadena5(ArrayList<Character>letras){
		ArrayList<Character> cadena = new ArrayList<Character>();
		
		String palabra =" ";
		for (int i = 0; i < 5; i++) {
			cadena.add(letras.get(i));
			palabra = palabra + cadena.get(i);
		}
		
		System.out.println(palabra);
		return cadena;
		
	}
}
