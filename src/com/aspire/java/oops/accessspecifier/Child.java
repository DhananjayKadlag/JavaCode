package com.aspire.java.oops.accessspecifier;
//same package--child class
public class Child extends Parent {
	public void m5()  //public method   ---->HIGHEST
	{
		System.out.println("public method from child class");
		
	}
	void m6()  //default method from parent class
	{
		System.out.println("default methhod from child class");
	}
	protected void m7()
	{
		System.out.println("protected method from child class");
		
	}
	private void m8()   //LOWEST
	{
		System.out.println("private method from child class");
}
 
	public static void main(String[] args)
	{
		Child c= new Child();
		c.m5();
		c.m6();
		c.m7();
		c.m8();
		c.m1();
		c.m2();
		c.m3();
		//m4 can not be called in child class
		 Sample s =new Sample();
		 s.m9();
		 s.m10();
		 s.m11();
		 //s.m12();  --- private class
		 
		 Parent p=new Parent();
		 p.m1();
		 p.m2();
		 p.m3();
		 //p.m4();   ----private class can not be called
		 
		 
		 
				 
		
		
		
		
		
	}
	
}


