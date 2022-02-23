package com.aspire.java.methods;

import com.aspire.java.logicalprograms.DiffPack;

public class SampleStaticMethod {
public static void main(String[] args) 
{
	System.out.println("running main method");
	method1();
	method2();
	
	DiffClass.method4();
	DiffPack.method8();
	
	
	SampleStaticMethod object1=new SampleStaticMethod();
	object1.method3();
	
	DiffClass object2=new DiffClass();
	object2.method5();
	
	DiffPack object3=new DiffPack();
	object3.method9();
	
	System.out.println("main method end");
}
public static void method1()
{
	System.out.println("runnin static method 1 from same class");
}
public static void method2()
{
	System.out.println("running static method2 from same class");
}
public void method3()
{
	System.out.println("running non static method3 from same class");
}
}
