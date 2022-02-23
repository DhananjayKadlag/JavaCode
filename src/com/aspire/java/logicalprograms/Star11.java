package com.aspire.java.logicalprograms;


//    1
//   1 1
//  1 1 1
// 1 1 1 1
//1 1 1 1 1 
//rows=1-5, column=1-5 , space 4-0
public class Star11 {
public static void main(String[] args)
{
	for(int i=1;i<=5;i++)
	{
		for(int s=4;s>=i;s--) 
		{
			System.out.print(" ");
		}
		System.out.print("1");
	for(int j=0;j<i-2;j++)
	{
		System.out.print(11);
	}
	System.out.println();
	}
	
	
	
}
}
