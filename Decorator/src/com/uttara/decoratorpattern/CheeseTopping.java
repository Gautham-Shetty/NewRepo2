//Decorator class2
package com.uttara.decoratorpattern;

public class CheeseTopping extends ToppingDecorator {
	
   private Pizza pizza;
    
   public CheeseTopping(Pizza pizza)
	{
		this.pizza=pizza;
	}

      public String getDescription()
      {
    	  String s= this.pizza.getDescription()+" with cheese topping";
    	  return s;
      }
@Override
public int getCost() {
	// TODO Auto-generated method stub
	return pizza.getCost()+100;
}

}
