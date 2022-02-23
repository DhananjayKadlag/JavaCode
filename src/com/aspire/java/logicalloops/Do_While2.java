package com.aspire.java.logicalloops;

public class Do_While2 {
public static void main(String[] args)
{ int marks=50;
int passingmarks=40;
do
{
	if(marks>=passingmarks)
	{
		System.out.println("congradulation you are pass");
	}
	else
	{
	System.out.println("your marks "+marks+"are less please appear in exam ");
	marks++;
}
}
while(marks<=passingmarks);
	
}
}
