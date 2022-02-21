package com.aspire.java.oops.polymorphism.methodoverriding;

public class Parent {

	public void money()
	{
		System.out.println("parent money -rs 50000");
	}
	public void farm()
	{
		System.out.println("parent farm -rs 10 ekar");
	}
	public void bunglow()
	{
		System.out.println("parent bunglow -1 nos");
	}
	public void car()
	{
		System.out.println("parent car -1 nos");
	}
	final public void Daughterinlaw()
	{
		System.out.println("parent decleare final keyword for daughterinlaw");
		
	}
	public static void jwellary()
	{
		System.out.println("parent decleared static keyward for jwellary method");
	}
	public void addition(int a, int b)
	{
		int c=a+b;
		System.out.println("parent addition="+c);
	}
}
