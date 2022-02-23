package com.aspire.java.logicalloops;
//1
//1 2
//2 3 4
//4 5 6 7
//7 8 9 10 11
//rows=5 , column=5
public class Number6 {
public static void main(String [] args)
{
	for (int i=1;i<=5;i++)
	{
		for (int j=1;j<=i;j++)
		{
			System.out.print(i-1+j+" ");
		}
		System.out.println();
	}
}
}
