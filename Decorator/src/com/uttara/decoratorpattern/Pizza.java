//Super type

package com.uttara.decoratorpattern;

public abstract class Pizza {

	private String pizzaname;
	
	  public void setDiscription(String pizzaname)
	  {
		  this.pizzaname=pizzaname;
	  }
	
	
	public  String getDescription()
	{
		return pizzaname;
	}
	
	
	public abstract int getCost();
	
}
