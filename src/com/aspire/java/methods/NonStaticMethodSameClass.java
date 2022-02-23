package com.aspire.java.methods;

import com.aspire.java.methodsdiffPackMethod.DiffPack;

/*                        static method               non static method
 * same class             1,2                         11,12
 * different class        2,3,4                       12,13,14
 * different class        2,5,6                       12,15,16
 * 
 * 
 */
public class NonStaticMethodSameClass {
public static void main(String [] args)
{
	System.out.println("main method start");
	NonStaticMethodSameClass object=new NonStaticMethodSameClass();
	//class name object name=new classname();
	//objectname.methodname
	object.method11();
	object.method12();
	
	NonstaticmethodDiffClass object1=new NonstaticmethodDiffClass();
	object1.method13();
	object1.method14();
	object1.method12();
	
	DiffPack object2=new DiffPack();
	object2.method12();
	object2.method15();
	object2.method16();
	
			
	
	
	System.out.println("main method end");
}
public void method11()
{
	System.out.println("running non static method 11 from same class");
}
public void method12()
{
	System.out.println("running non static method 12 from same class");
}
}
