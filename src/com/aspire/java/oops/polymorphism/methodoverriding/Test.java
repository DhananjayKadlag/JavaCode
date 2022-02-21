package com.aspire.java.oops.polymorphism.methodoverriding;

public class Test {
public static void main(String[] args)
{// parent property
	System.out.println("parent properties");
	Parent p=new Parent();
			p.money();
			p.farm();
			p.bunglow();
			p.car();
			
			
		// child property
			System.out.println("child property");
			Child c=new Child();
			c.car();   //unique from parent class
			c.bike();  //unique from child class
			c.money();
			c.farm();
			c.bunglow();
			c.jwellary();
			c.addition(10,12,13);
				
}
}
