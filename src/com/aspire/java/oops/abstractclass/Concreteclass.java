package com.aspire.java.oops.abstractclass;

public class Concreteclass extends Abstractclass{

	
	public void substraction() {
		
		int sub=a-b;
		System.out.println("sub="+sub);
	}

	
	public void multiplication() {
		int multi=a*b;
		System.out.println("multi="+multi);	
	}

	public void division() {
	int div;
	div=a/b;
	System.out.println("div="+div);
		
	}
	public static void main(String[] args)
	{
		Concreteclass cc=new Concreteclass();
		cc.addition();          //parent -concrete method
		cc.substraction();      //patrent abstract
		cc.multiplication();    //parent abstract
		cc.division();          //parent abstract
	}

}
