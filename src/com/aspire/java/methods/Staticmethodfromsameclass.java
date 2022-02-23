package com.aspire.java.methods;

import com.aspire.java.methodsdiffPackMethod.DiffPackStaticMethod;

/*
 *                        ststic nethod           non static method
 * same class            1,2
 * different class       3,4
 * different package     5,6
 * 
 */

public class Staticmethodfromsameclass {
public static void main(String[] args) 
{
	System.out.println("main method start");
	
	method1();  //same class
	dhananjay();//same class
	method2();//same class
	
	Differentclass.method3();  //different class
	Differentclass.method4();//different class
	Differentclass.method2();//different class
	
	DiffPackStaticMethod.method5();//diff pack
	DiffPackStaticMethod.method6();//diff pack
	DiffPackStaticMethod.method2();
	
	System.out.println("main method end");//diff pack
	
}
public static void method1()//static method from same class
{
	System.out.println("running static method from same class");
}
public static void dhananjay()
{
	System.out.println("running static method dhananjay from same class");
}
public static void method2()
{
	System.out.println("running static method2 from same class ");
}
}
