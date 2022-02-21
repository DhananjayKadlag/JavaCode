package com.aspire.java.oops.thissuper;

public class Child extends Parent{
int a=100;  //global non static variable
int b=200;  //global non static variable
int j=3000;
public void addition()
{
	int a=10;  //local non static variable
	int b=20;   //local non static variable
	int k=30;
	
	
	System.out.println("local variable a= "+a);
	System.out.println("local variable b= "+b);
	System.out.println("local variable a+b= "+(a+b));
	System.out.println("global from same class a="+this.a);
	System.out.println("GLOBAL FROM SAME CLASS b= "+this.b);
	System.out.println("global from parent class a="+super.a);
	System.out.println("GLOBAL FROM parent CLASS b= "+super.b);
	
	
	int c=super.a+this.b+b;
	System.out.println(c);	
	System.out.println("global from parent classi=" +i);
	System.out.println("global from same classj=" +j);
	System.out.println("local variable k=" +k);
}
//local variable from child classare not available to any other method




}
