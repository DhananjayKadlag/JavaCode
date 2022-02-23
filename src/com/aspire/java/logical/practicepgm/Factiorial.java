package com.aspire.java.logical.practicepgm;
//factorial 4=4*3*2*1=24
public class Factiorial {
public static void main(String[] args) 
{
int num=4;
int fact=1;
for (int i=num;i>1;i--)
{
	fact=fact*i;
}
System.out.println("factorial of "+num+" is "+fact);
}
}
