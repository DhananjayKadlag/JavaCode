

package com.aspire.java.oops.accessspecifier;
//same package---different class
public class Sample {
	public void m9()  //public method   ---->HIGHEST
	{
		System.out.println("public method from same package different class-sample");
		
	}
	void m10()  //default method from parent class
	{
		System.out.println("default methhod from same package different class-sample ");
	}
	protected void m11()
	{
		System.out.println("protected method from same package different class-sample ");
		
	}
	private void m12()   //LOWEST
	{
		System.out.println("private method from same package different class-sample");
}
	//all 4 methos can called in same class
	public static void main(String [] args)
	{
	Sample sam=new Sample();
	  sam.m9();
	  sam.m10();
	  sam.m11();
	  sam.m12();
}
	}