package com.excepciones;

import java.util.ArrayList;

public class listaDeExcepciones {

	public static void main(String[] args) {
		ArrayList<Object> myList = new ArrayList<Object>();
		myList.add("13");
		myList.add("Hola Mundo");
		myList.add(48);
		myList.add("Adios Mundo");
		
		for(int i = 0; i < myList.size(); i++) {
			try {
				int castedValue = (int) myList.get(i);
				System.out.println(myList.get(i));
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		    
		}
		System.out.println("pasó el try and catch!!!!!");

	}

}
