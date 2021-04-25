package br.edu.ifpb.padroes.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

/**
 * @author andreia
 *
 */
public class BaseDecorator implements Pizza {

	private Pizza wrappee;

	BaseDecorator(Pizza pizza) {
		this.wrappee = pizza;
	}

	@Override
	public Float getPrice() {
		// TODO Auto-generated method stub
		return wrappee.getPrice();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return wrappee.getName();
	}
//
//	@Override
//	public void cacularPreco(boolean discount) {
//		wrappee.cacularPreco(discount);
//		
//	}

}
