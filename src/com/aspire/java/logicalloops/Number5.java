package com.aspire.java.logicalloops;
//1
//1 2
//1 2 3
//1 2 3 4 
//1 2 3 4  5
//rows=5, column=5
public class Number5 {
public static void main(String[] args)
{
	for( int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
}
}
