package com.java.maestro2;

public class Wizard extends Human{

	public Wizard() {
		this.setVida(50);
		this.setInteligencia(8);
	}

	
	
	public void heal(Human human) {
		int curacion = this.getInteligencia();
		int vidaHumano = human.getVida();
		
		human.setVida(vidaHumano + curacion);
		System.out.println("Wizard cura a "+human.getNombre()+" en "+curacion+", vida total: "+human.getVida());
		
	}
	public void fireBall(Human human) {
		int bolaFuego = this.getInteligencia()*3;
		int vidaHumano = human.getVida();
		human.setVida(vidaHumano - bolaFuego);
		System.out.println("Wizard ataca a "+human.getNombre()+ " y le hace "+bolaFuego+" de daño, vida:"+human.getVida());
	}
	
	
}
