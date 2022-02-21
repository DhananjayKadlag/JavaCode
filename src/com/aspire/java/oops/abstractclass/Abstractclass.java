package com.aspire.java.oops.abstractclass;

abstract public class Abstractclass {
int a=20;
int b=12;
public void addition()   //complete/concrete merthod
{
	int add;
	add=a+b;
	System.out.println("add="+add);
}
abstract public void substraction();  //incomplete/abstract method
abstract public void multiplication();  //
abstract public void division();

}
