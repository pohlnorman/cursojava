package com.java.maestro2;

public class Ninja extends Human{

	public Ninja() {
		this.setSigilo(10);
		
		
	}
	
	//metodo
	public void steal(Human human) {
		int roboVida = this.getSigilo();
		int vidahumano = human.getVida();
		int vidaNinja = this.getVida();
		
		human.setVida(vidahumano - roboVida);
		this.setVida(vidaNinja + roboVida);
		System.out.println("el ninja le roba "+roboVida+" de vida a "+human.getNombre());
		System.out.println("vida de "+human.getNombre()+" = "+human.getVida());
		System.out.println("vida del ninja= "+this.getVida());
		System.out.println("------------------------------------");
		
	}
	
	public void runAway() {
		int escapar = this.getSigilo();
		int vidaNinja = this.getVida();
		
		this.setVida(vidaNinja - escapar);
		System.out.println("el Ninja escapa y se pierde en las sombras, gasta "+escapar+" de vida");
		System.out.println("vida del ninja = "+this.getVida());
		System.out.println("------------------------------------");
	}

	
}
