//Decorator class 1

package com.uttara.decoratorpattern;

public class PannerTopping extends ToppingDecorator {
	
	private Pizza pizza;

	public PannerTopping(Pizza pizza)
	{
		this.pizza=pizza;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		String s=this.pizza.getDescription()+" with panner topping";
		return s;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return this.pizza.getCost()+50;
	}

}
