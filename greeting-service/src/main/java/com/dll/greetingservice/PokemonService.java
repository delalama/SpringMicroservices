package com.dll.greetingservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("pokemon-service")
public interface PokemonService {

	@GetMapping
	String getPokemon();

}
