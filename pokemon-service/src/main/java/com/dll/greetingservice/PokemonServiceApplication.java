package com.dll.greetingservice;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PokemonServiceApplication {

	private final Environment environment;
	private final List<String> pokemonsList = Arrays.asList(
			"Bulbasaur","Ivysaur","Venusaur","Charmander","Charmeleon","Charizard","Squirtle","Wartortle","Blastoise","Caterpie","Metapod","Butterfree","Weedle","Kakuna","Beedrill","Pidgey","Pidgeotto","Pidgeot","Rattata","Raticate"
	);

	public PokemonServiceApplication(Environment environment) {

		this.environment = environment;
	}

	public static void main(String[] args) {

		SpringApplication.run(PokemonServiceApplication.class, args);
	}

	@GetMapping
	public String getPokemon() {

		Random rand = new Random();
		String randomPokemon = pokemonsList.get(rand.nextInt(pokemonsList.size()));

		return "Your pokemon is: " + randomPokemon;
	}
}





