package com.aspire.java.logicalloops;
//1 2 3 4 5 
//6 7 8 9 10 
//11 12 13 14 15
//16 17 18 19 20
//rows=4,column=5
public class Number_1 {
public static void main(String[] args)
{
	for(int i=1;i<=4;i++)
	{
		for (int j=1;j<=5;j++)
		{
			//System.out.print((i*5)+j-5+" ");
			System.out.print((i-1)*5+j+" ");
		}
		
		System.out.println();
	}
	
}
}
