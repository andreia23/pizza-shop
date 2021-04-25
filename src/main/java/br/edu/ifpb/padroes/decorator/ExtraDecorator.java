package br.edu.ifpb.padroes.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class ExtraDecorator extends BaseDecorator {

	public ExtraDecorator(Pizza pizza) {
		super(pizza);
	}

	@Override
	public Float getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice() * 1.10f;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName() + " (extra cheese)";
	}

}
