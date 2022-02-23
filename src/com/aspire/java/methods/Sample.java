package com.aspire.java.methods;

public class Sample {
public static void main(String[] args) 
{
  	System.out.println("i am from  main method body execute");
  	addition();
  	substraction();
  	
}
public static void addition()//addition
{
	int a=10;
	int b=20;
	int c;
	c=a+b;
	System.out.println(c);
	System.out.println("i am from addition method body");
}
public static void substraction()
{
	int d=25;
	int e=76;
	int h;
	h=e-d;
	System.out.println(h);
System.out.println("i am from substraction");	
}
}
