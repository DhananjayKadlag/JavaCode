package com.aspire.java.oops.variabletype;

public class Test {
public static void main(String[] args)
{
	
Sample object=new Sample();

//variable call

System.out.println(object.a);
System.out.println(object.s);
System.out.println(Sample.i);


//method call

object.addition();
object.multi();
Sample.substraction();

	
	
}
}
