package com.java.ebasicos;

import java.util.ArrayList;

public class basicos {
	public void print1_255() {
		
		for (int i = 1; i <= 255; i++) {
			System.out.println(i);
		}
	}
//-----------------------------------------------	
	public void impares() {
		
		for (int i = 1; i <= 255; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
	}
	//----------------------------------------
	public void suma() {
		int suma = 0;
		for (int i = 0; i <= 255; i++) {
			suma = suma +i;
			System.out.println("nuevo numero: "+i+" suma: "+suma);
		}
	}
	//----------------------------------------
	public void recorre() {
		int[] arreglo = {1,3,5,7,9,13};
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
		
	}
	//---------------------------------
	public void mayor() {
		int[] arreglo = {-3,-5,-7};
		int aux = 0;
		for (int i = 0; i < arreglo.length-1; i++) {
			if (arreglo[i]>arreglo[i+1]) {
				aux = arreglo[i];
				arreglo[i] = arreglo[i+1];
				arreglo[i+1] = aux;
			}
		}
		System.out.println(arreglo[2]);
	}
	//----------------------------------------------
	public void promedio() {
		int[] arreglo = {2,10,3};
		int suma = 0;
		double promedio = 0;
		for (int i = 0; i < arreglo.length; i++) {
			suma = suma + arreglo[i];
		}
		promedio = suma / arreglo.length;
		System.out.println(promedio);
		
		
	}
	//----------------------------------------------
	public void arregloimpares() {
		ArrayList<Integer> arreglo = new ArrayList<Integer>();
		for (int i = 1; i <= 255; i++) {
			if (i % 2 != 0) {
				arreglo.add(i);
			}
		}
		System.out.println(arreglo);
	}
	//--------------------------------
	public void mayorque() {
		int[] arreglo = {1,3,5,7};
		int n = 3;
		int total = 0;
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] > n) {
				total = total + 1;
			}
		}
		System.out.println(total);
	}
	//--------------------------------
	public void cuadrado() {
		int[] arreglo = {1,5,10,-2};
		
		
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println("numero: "+arreglo[i]);
			arreglo[i] = arreglo[i] * arreglo[i];
			System.out.println("numero al cuadrado: "+arreglo[i]);
		}
	}
	//--------------------------------
	public void eliminanegativo() {
		ArrayList<Integer> myArray = new ArrayList<Integer>();
		myArray.add(1);
		myArray.add(5);
		myArray.add(10);
		myArray.add(-2);
		
		System.out.println(myArray);
		for (int i = 0; i < myArray.size(); i++) {
			if (myArray.get(i) < 0) {
				myArray.set(i, 0);
			}
			
		}
		System.out.println(myArray);
		
	}
	//----------------------------------
	public void minmaxpro() {
		int[] arreglo = {1,5,10,-2};
		int max = -100;
		int min = 100;
		int suma = 0;
		double pro = 0;
		for (int i = 0; i < arreglo.length; i++) {
			suma = suma + arreglo[i];
			if (arreglo[i]<min) {
				min = arreglo[i];
			}
			if (arreglo[i]>max) {
				max = arreglo[i];
			}
			
		}
		pro = suma/arreglo.length;
		System.out.println("valor mayor: "+max);
		System.out.println("valor menor: "+min);
		System.out.println(suma);
		System.out.println("el promedio es :"+pro);
	}
	//-------------------------------------------
	public void cambiandovalores() {
		int[] arreglo = {1,5,10,7,-2};
		for (int i = 1; i < arreglo.length; i++) {
			
			arreglo[i-1]=arreglo[i];
			System.out.println(arreglo[i]);
			
		}
		System.out.println(arreglo[4]=0);
		
	}

}
