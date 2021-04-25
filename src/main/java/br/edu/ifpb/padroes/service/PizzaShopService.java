package br.edu.ifpb.padroes.service;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpb.padroes.api.damenos.DamenosPizza;
import br.edu.ifpb.padroes.api.damenos.proxy.DamenosService;
import br.edu.ifpb.padroes.api.damenos.proxy.DamenosServiceProxy;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotPizza;
import br.edu.ifpb.padroes.api.pizzahot.proxy.PizzaHotService;
import br.edu.ifpb.padroes.api.pizzahot.proxy.PizzaHotServiceProxy;
import br.edu.ifpb.padroes.domain.Pizza;
import br.edu.ifpb.padroes.domain.adapter.DamenosAdapter;
import br.edu.ifpb.padroes.domain.adapter.PizzahotAdapter;

public class PizzaShopService {

	private DamenosService damenosService;
	private PizzaHotService pizzaHotService;

	public PizzaShopService() {
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

	public List<Pizza> getPizzas() {
		List<Pizza> pizzas = new ArrayList<>();

		List<DamenosPizza> damenos = damenosService.getPizzas();
		
		List<PizzaHotPizza> hots  = pizzaHotService.getPizzas();

		for (DamenosPizza dameno: damenos) {
			pizzas.add(new DamenosAdapter(dameno));
		}
		
		for (PizzaHotPizza hot: hots) {
			pizzas.add(new PizzahotAdapter(hot));
		}
		
		return pizzas;

	}

	public List<DamenosPizza> getPizzasDamenos() {
		return damenosService.getPizzas();
	}

	public List<PizzaHotPizza> getPizzasPizzaHot() {
		return pizzaHotService.getPizzas();
	}

}
