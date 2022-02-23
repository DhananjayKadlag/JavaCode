package com.aspire.java.arrays;

public class Solution_2 {
public static void main(String[] args)
{
	Integer arr[]= {1,3,8,35,35,35,20,20,15};
	int temp=0;
	for (int  i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
		if(arr[i]< arr[j])
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		}
	}
	System.out.print("Array in decending order ");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+ " ");
	}
}
}
