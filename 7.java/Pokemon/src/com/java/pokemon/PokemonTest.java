package com.java.pokemon;

public class PokemonTest {

	public static void main(String[] args) {
		Pokedex pokedex = new Pokedex();
		Pokemon pikachu = pokedex.createPokemon("pikachu",100, "electrico");
		Pokemon onix = pokedex.createPokemon("onix", 200, "piedra");
			
		
		
		System.out.println(pokedex.pokemonInfo(pikachu));
		System.out.println(pokedex.pokemonInfo(onix));
		pikachu.attackPokemon(onix);
		
		
		

	}

}
