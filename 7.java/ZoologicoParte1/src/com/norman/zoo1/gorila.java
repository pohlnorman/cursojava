package com.norman.zoo1;

public class gorila extends mamifero{
	public void throwSomething() {
		energylevel = energylevel - 5;
		System.out.println("El gorila lanzo algo");
		displayEnergy();
	}
	
	public void eatBananas() {
		energylevel = energylevel + 10;
		System.out.println("El gorila se come 1 platano y queda feliz");
		displayEnergy();
	}
	
	public void climb() {
		energylevel = energylevel - 10;
		System.out.println("el gorila trepa a la copa de un arbol");
		displayEnergy();
	}

}
