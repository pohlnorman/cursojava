package com.java.pokemon;

public class Pokemon {
	private String name;
	private int health = 0;
	private String type;
	private static int count = 0;
	public Pokemon(String name, int health, String type) {
		super();
		this.name = name;
		this.health = health;
		this.type = type;
		count = count +1;
	}
	public Pokemon() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	//metodos
	public void attackPokemon(Pokemon pokemon) {
		int ataque = 10;
		int vidapokemon = pokemon.getHealth();
		pokemon.setHealth(vidapokemon - ataque);
		
		System.out.println(pokemon.getName()+" "+pokemon.getHealth());
	}
	
}
