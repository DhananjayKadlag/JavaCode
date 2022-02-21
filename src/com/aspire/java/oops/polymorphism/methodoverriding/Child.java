package com.aspire.java.oops.polymorphism.methodoverriding;

public class Child extends Parent{
	public void money()    //declearation
	{
		//defination
		
		System.out.println("child money= rs 10000");
	}
	public void farm()
	{
		System.out.println("child farm -rs 1 ekar");
	}
	public void bunglow()
	{
		System.out.println("child bunglow -2 nos");
	}	
	public void bike()
	{
		System.out.println("child bike -1 nos");
	}
      //public void Daughterinlaw() //final method from parent class can not be override
	{
		
	}
	public static void jwellary()
	{
		System.out.println("child's jwellary");
	}
	public void addition(int i, int j, int l)
	{
		int k=2*i+3*j;
		System.out.println("child addition="+k);
	}
}
