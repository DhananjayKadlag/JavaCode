package com.aspire.java.logical.practicepgm;
// num=12345; 
// o/p=54321
public class ReverseNos {
public static void main(String[] args) 
{
	int num=12345;
	int rev=0;
	int rem=0;
	int temp=num;
	while(num>0)
	{
		rem=num%10 ; //5
	    rev=rev*10+rem;
	    num=num/10;
	}
	System.out.println("reverse no "+rev);	
	
if(rev==temp)
{
	System.out.println("palindromeno");
}
else {
	System.out.println("not a palindrome no");
}
}
}