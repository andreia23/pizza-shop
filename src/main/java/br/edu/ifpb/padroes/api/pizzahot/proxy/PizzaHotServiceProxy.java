package br.edu.ifpb.padroes.api.pizzahot.proxy;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpb.padroes.api.pizzahot.PizzaHotPizza;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotServiceImpl;

// TODO - implementar proxy de cache para evitar leitura do json a cada chamada do método
public class PizzaHotServiceProxy implements PizzaHotService {
	
	PizzaHotService pizzaHotService;

	List<PizzaHotPizza> cachePizzas = new ArrayList<>();

	public PizzaHotServiceProxy() {
		this.pizzaHotService = new  PizzaHotServiceImpl();
	}

	@Override
	public List<PizzaHotPizza> getPizzas() {
		if (cachePizzas.isEmpty()) {
			cachePizzas = pizzaHotService.getPizzas();
		} else {
			System.out.println("Retrieved list from cache.");
		}
		return cachePizzas;
	}
}
