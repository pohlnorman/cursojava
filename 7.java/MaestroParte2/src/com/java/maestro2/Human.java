package com.java.maestro2;

public class Human {
	private int fuerza = 3;
	private int inteligencia = 3;
	private int sigilo = 3;
	private int vida = 100;
	private String nombre = "luis";
	
	//constructores
	public Human(int fuerza, int inteligencia, int sigilo, int vida) {
		
		this.fuerza = fuerza;
		this.inteligencia = inteligencia;
		this.sigilo = sigilo;
		this.vida = vida;
	}
	public Human(String nombre) {
		this.nombre = nombre;
	}
	public Human() {
		
	}
	
	//get y set
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
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
}
