package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.api.damenos.DamenosPizza;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotPizza;
import br.edu.ifpb.padroes.decorator.DiscountDecorator;
import br.edu.ifpb.padroes.decorator.ExtraDecorator;
import br.edu.ifpb.padroes.decorator.StuffedDecorator;
import br.edu.ifpb.padroes.domain.Pizza;
import br.edu.ifpb.padroes.domain.PizzaShopPizza;
import br.edu.ifpb.padroes.service.PizzaShopService;

public class Main {

	public static void main(String[] args) {

		PizzaShopService pizzaShopService = new PizzaShopService();

		System.out.println("Pizzas - menu");

		for (Pizza pizza : pizzaShopService.getPizzas()) {
			System.out.println(String.format("%s - %.2f", pizza.getName(), pizza.getPrice()));
		}

		Pizza pizza = new PizzaShopPizza("pepperoni", 55.0f);

		Pizza discountCoupon = new DiscountDecorator(pizza);
		Pizza extraCheese = new ExtraDecorator(discountCoupon);
		Pizza stuffedCrust = new StuffedDecorator(extraCheese);

		pizzaShopService.orderPizza(stuffedCrust);

	}

}
