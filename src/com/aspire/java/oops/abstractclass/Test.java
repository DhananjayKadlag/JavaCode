package com.aspire.java.oops.abstractclass;

public class Test{
public static void main(String[] args)
{
	//Parent p=new Parent();     not able to create abstract class 
	System.out.println("abstract method from parent implimentation by child1");
	Child1 c1=new Child1();
	c1.openbrowser();
	c1.enterurl();
	c1.enterusername();
	c1.enterpassword();
	c1.shopanitem();
	c1.logout();
	
	System.out.println("abstract method from parent implimentation by child2");
	Child2 c2=new Child2();
	c2.openbrowser();
	c2.enterurl();
	c2.enterusername();
	c2.enterpassword();
	c2.shopanitem();
	c2.logout();
	
	System.out.println("abstract method from parent implimentation by child3");
	Child3 c3=new Child3();
	c3.openbrowser();
	c3.enterurl();
	c3.enterusername();
	c3.enterpassword();
	c3.shopanitem();
	c3.logout();	
	
			
			
}

	
	
	
	
	
	
	
	

}
