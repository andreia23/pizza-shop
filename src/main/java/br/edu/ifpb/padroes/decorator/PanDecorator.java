package br.edu.ifpb.padroes.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class PanDecorator extends BaseDecorator{

	PanDecorator(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public Float getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice() * 1.15f;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName() + " (pan pizza)";
	}
}
