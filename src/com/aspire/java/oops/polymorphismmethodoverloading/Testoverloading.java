package com.aspire.java.oops.polymorphismmethodoverloading;

public class Testoverloading {
public static void main(String[] args)
{
	//parent class object
	Overloading ol=new Overloading();
	ol.addition();
	ol.addition(12);
			ol.addition("ATI");
			ol.addition(20,22);
			
//child class object
			Child col=new Child();
			col.addition(100);
			col.addition();
			col.addition(12,14);
			col.addition(10,12,14,16);
			
			
					
}
public void main()
{
	
}

}
