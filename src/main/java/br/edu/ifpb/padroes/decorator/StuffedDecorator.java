package br.edu.ifpb.padroes.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class StuffedDecorator extends BaseDecorator{

	public StuffedDecorator(Pizza pizza) {
		super(pizza);
	}
	
	
	@Override
	public Float getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice() * 1.20f;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName() + " (stuffed crust)";
	}
}
