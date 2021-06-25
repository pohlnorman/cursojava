package com.java.maestro2;

public class Samurai extends Human{

	public Samurai() {
		this.setVida(200);
	}
	
	//metodo
	public void deathBlow(Human human) {
		
		int vidaHumano = human.getVida();
		int vidaSamurai = this.getVida();
		
		human.setVida(vidaHumano - 100);
		this.setVida(vidaSamurai/2);
		System.out.println("el Samurai usa su ataque y mata al Humano, el Samurai gasta mucha energia");
		System.out.println("vida del Humano = "+human.getVida());
		System.out.println("vida dle Samurai = "+this.getVida());
	}
	
	public void meditate() {
		int vidaSamurai = this.getVida();
		int meditacion = vidaSamurai/2;
		
		this.setVida(vidaSamurai + meditacion);
		
		System.out.println("el Samurai usa meditacion para recuperar energia");
		System.out.println("vida del Samurai = "+this.getVida());
		
	}

}
