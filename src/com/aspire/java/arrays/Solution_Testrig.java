package com.aspire.java.arrays;

public class Solution_Testrig {
public static void main(String[] args)
{
	String str="I 123am 4an5 6789automation2-34engineer56";
	str=str.replaceAll("[^\\d]", " ");
	str=str.trim();
	str=str.replaceAll(" +", " ");
System.out.println("output: "+str);
String[] splited=str.split(" ");
System.out.println("output2: ");
for(String s:splited)
{
	int number=Integer.parseInt(s);
	int temp=number;
	int digit=0;
	int sum =0;
	while(number >0)
	{
		digit = number%  10;
		sum=sum+digit;
		number=number/10;
	}
	System.out.println("sum of"+temp+"="+sum+", ");
}
}
}
