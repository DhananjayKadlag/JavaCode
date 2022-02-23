package com.aspire.java.arrays;

import java.util.Arrays;

public class Onedimensional {
public static void main(String[] args)
{
	//int a=1;
	//int b=2;
	//int c=3;
	//int d=4;
	//int e=5, f=6, g=7, h=8, i=9, j=10;
	
	// instead of this we use ARRAYS
	int[] a= {1,2,3,4,5,6,7,8,9,10};  // size=10=count of element
    int [] b= {11,12,13};
    int c[]= {14,15,16,17,18};
    char[] d= {'A', 'B', 'C','D'};
    String[] e= {"Aspire","Training"," Institute","pune"};
	

int[] i=new int[7];
i[0]=5;
i[1]=6;
i[2]=7;
i[3]=8;
i[4]=9;
i[5]=10;
i[6]=11;


System.out.println("length of i[]="+i.length);
System.out.println("element of 3 rd index in a[]="+a[3]);
System.out.println(b[1]);
System.out.println(e[2]);



for(int k=0;k<=a.length-1;k++)
{
	System.out.print(a[k]);
	System.out.println();
	for(int j=0; j<e.length;j++)
	{
		System.out.print(e[j]+" ");
	}
	
	int[] f= {12,5,18,35,45,45,2,984,5,64,4556};
	Arrays.sort(f);
	for(int l=0;l<f.length;l++)
	
	System.out.print(f[l]+" ");
	
	
	System.out.println();
}

}
}
