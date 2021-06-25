package com.norman.maestro1;

public class Humano {
	private int fuerza = 3;
	private int inteligencia = 3;
	private int sigilo = 3;
	private int vida = 100;
	private String nombre = "";
	
	
	
	public Humano(String nombre) {
		
		this.nombre = nombre;
	}
	// get y set
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getFuerza() {
		return fuerza;
	}
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	public int getInteligencia() {
		return inteligencia;
	}
	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}
	public int getSigilo() {
		return sigilo;
	}
	public void setSigilo(int sigilo) {
		this.sigilo = sigilo;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public void attack(Humano atacado) {
		int fuerzaAtacante = this.getFuerza();
		int vidaAtacado = atacado.getVida();
		System.out.println(getNombre()+" ataca a "+atacado.getNombre());
		atacado.setVida(vidaAtacado - fuerzaAtacante);
		
	}
	
}
