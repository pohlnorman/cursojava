package com.rompecabezas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJavaTest {

	
	public static void main(String[] args) {
		PuzzleJava p = new PuzzleJava();
		
		/**
		ArrayList<Integer>numeros = new ArrayList<Integer>();
		numeros.add(3);
		numeros.add(5);
		numeros.add(1);
		numeros.add(2);
		numeros.add(7);
		numeros.add(9);
		numeros.add(13);
		numeros.add(25);
		numeros.add(32);
		System.out.println(p.suma(numeros));
		*/
		
		/**
		ArrayList<String>nombres = new ArrayList<String>();
		nombres.add("homero");
		nombres.add("marge");
		nombres.add("bart");
		nombres.add("lisa");
		nombres.add("maggie");
		Collections.shuffle(nombres);
		System.out.println(p.mezcla(nombres));
		*/
		
		
		ArrayList<Character> letras = new ArrayList<Character>();
		letras.add('a');
		letras.add('b');
		letras.add('c');
		letras.add('d');
		letras.add('e');
		letras.add('f');
		letras.add('g');
		letras.add('h');
		letras.add('i');
		letras.add('j');
		letras.add('k');
		letras.add('l');
		letras.add('m');
		letras.add('n');
		letras.add('o');
		letras.add('p');
		letras.add('q');
		letras.add('r');
		letras.add('s');
		letras.add('t');
		letras.add('u');
		letras.add('v');
		letras.add('w');
		letras.add('x');
		letras.add('y');
		letras.add('z');
		Collections.shuffle(letras);
		System.out.println(p.mezclaletras(letras));
		
		
		/**
		Random r = new Random();
		ArrayList<Integer> random = new ArrayList<Integer>();
		random.add(r.nextInt(45)+55);
		random.add(r.nextInt(45)+55);
		random.add(r.nextInt(45)+55);
		random.add(r.nextInt(45)+55);
		random.add(r.nextInt(45)+55);
		random.add(r.nextInt(45)+55);
		random.add(r.nextInt(45)+55);
		random.add(r.nextInt(45)+55);
		random.add(r.nextInt(45)+55);
		random.add(r.nextInt(45)+55);
		System.out.println(p.aleatorio(random));
		*/
		
		/**
		Random ro = new Random();
		ArrayList<Integer> ordenado = new ArrayList<Integer>();
		ordenado.add(ro.nextInt(45)+55);
		ordenado.add(ro.nextInt(45)+55);
		ordenado.add(ro.nextInt(45)+55);
		ordenado.add(ro.nextInt(45)+55);
		ordenado.add(ro.nextInt(45)+55);
		ordenado.add(ro.nextInt(45)+55);
		ordenado.add(ro.nextInt(45)+55);
		ordenado.add(ro.nextInt(45)+55);
		ordenado.add(ro.nextInt(45)+55);
		ordenado.add(ro.nextInt(45)+55);
		Collections.sort(ordenado);
		System.out.println(p.aleatorio(ordenado));
		System.out.println(ordenado.get(0));
		System.out.println(ordenado.get(9));
		*/
		
		System.out.println(p.cadena5(letras));
	}

}
