package com.norman.maestro1;

public class HumanoTest {

	public static void main(String[] args) {
		Humano h1 = new Humano("norman");
		Humano h2 = new Humano("pedro");
		
		h1.attack(h2);
		System.out.println(h2.getVida());
		h1.attack(h2);
		System.out.println(h2.getVida());
		h1.attack(h2);
		System.out.println(h2.getVida());
		
		
		

	}

}
