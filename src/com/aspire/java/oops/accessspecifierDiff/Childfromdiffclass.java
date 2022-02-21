package com.aspire.java.oops.accessspecifierDiff;

import com.aspire.java.oops.accessspecifier.Parent;
import com.aspire.java.oops.accessspecifier.Sample;

public class Childfromdiffclass extends Parent {
public static void main(String[] args)
{
	Parent p=new Parent();
	p.m1();  //parent class object

	
	Childfromdiffclass cdf=new Childfromdiffclass();
	cdf.m1();  // public method from diff package with inheritance wrt child class object
	
	cdf.m3();  //protected method from diff package with inheritance wrt child class object
	
	Sample s2=new Sample();
	{
		s2.m9();  //public method from diff pack diff class
		
	}
			}
}
