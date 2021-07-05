//Tester class
package com.uttara.decoratorpattern;

public class TestDecorator {
	
	public static void main(String[] args)
	{
		Pizza v1=new VegPizza();
		  System.out.println("Name of pizza "+v1.getDescription()+" price of Pizza "+v1.getCost());
		Pizza c1=new ChickenPizza();
		 System.out.println("Name of pizza "+c1.getDescription()+" price of Pizza "+c1.getCost());
		
		 //Using the decorator design pattern to add PannerTopping additional feature to VegPizza without any extra coding
		Pizza p=new PannerTopping(v1);
		System.out.println("Name of pizza "+p.getDescription()+" price of Pizza "+p.getCost());
		//Using the decorator design pattern to add CheeseTopping additional feature to ChickenPizza without any extra coding
		Pizza c=new CheeseTopping(c1);
		System.out.println("Name of pizza "+c.getDescription()+" price of Pizza "+c.getCost());
		
		//Multiple decorator wrapped to single object 
		Pizza p2=new CheeseTopping(p);
		System.out.println("Name of pizza "+p2.getDescription()+" price of Pizza "+p2.getCost());//that is veg pizza got both panner and cheese topping
		
	}

}
