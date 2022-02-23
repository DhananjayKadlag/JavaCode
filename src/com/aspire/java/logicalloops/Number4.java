package com.aspire.java.logicalloops;

//1 2 3 4 5
//2 3 4 5 6
//3 4 5 6 7
//4 5 6 7 8
//rows=4, column=5
public class Number4 {
public static void main(String[] args)
{
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=5;j++)
		{
			System.out.print(i+j-1+" ");
		}
	System.out.println();
	}
	
	
}
}
