package com.aspire.java.oops.accessspecifier;
//same package---parent class
public class Parent {
public void m1()  //public method   ---->HIGHEST
{
	System.out.println("punlic method from parent class");
	
}
void m2()  //default method from parent class
{
	System.out.println("default methhod from parent class");
}
protected void m3()
{
	System.out.println("protected method from parent class");
	
}
private void m4()   //LOWEST
{
	System.out.println("private method from parent class");
}
}
