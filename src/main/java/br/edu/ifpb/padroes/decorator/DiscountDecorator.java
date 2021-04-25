package br.edu.ifpb.padroes.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class DiscountDecorator extends BaseDecorator{

	public DiscountDecorator(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public Float getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice() * 0.25f;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
}
