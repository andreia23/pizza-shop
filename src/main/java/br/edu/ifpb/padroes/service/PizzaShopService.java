package br.edu.ifpb.padroes.service;

import java.util.List;

import br.edu.ifpb.padroes.api.damenos.DamenosPizza;
import br.edu.ifpb.padroes.api.damenos.proxy.DamenosService;
import br.edu.ifpb.padroes.api.damenos.proxy.DamenosServiceProxy;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotPizza;
import br.edu.ifpb.padroes.api.pizzahot.proxy.PizzaHotService;
import br.edu.ifpb.padroes.api.pizzahot.proxy.PizzaHotServiceProxy;
import br.edu.ifpb.padroes.domain.Pizza;

public class PizzaShopService {

	private DamenosService damenosService;
	private PizzaHotService pizzaHotService;

	public PizzaShopService() {
		// TODO - alterar criação de instância para chamar para o Proxy de Cache
		damenosService = new DamenosServiceProxy();
		pizzaHotService = new PizzaHotServiceProxy();
	}

	public void orderPizza(Pizza pizza) {

		Float totalPrice = pizza.getPrice();
		String name = pizza.getName();

		System.out.println(String.format("New order for = %s", name));
		System.out.println(String.format("Total price = %f", totalPrice));

	}

	// TODO - implementar adapter para unificar pizzas vindas das APIs Damenos e
	// PizzaHot num único método getPizzas()
	// TODO - public List<Pizza> getPizzas() {}

	public List<DamenosPizza> getPizzasDamenos() {
		return damenosService.getPizzas();
	}

	public List<PizzaHotPizza> getPizzasPizzaHot() {
		return pizzaHotService.getPizzas();
	}

}
