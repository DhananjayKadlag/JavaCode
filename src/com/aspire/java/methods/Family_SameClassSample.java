package com.aspire.java.methods;

import com.aspire.java.methods.familyDiffPack.FamilyMem;

public class Family_SameClassSample {
public static void main(String[] args)
{
	System.out.println("running main method");
	kadlag(); //same class
	dhananjay();//same class
	
	DiffClassFamily.father();//diff class
	DiffClassFamily.mother();//diff class
	
	FamilyMem.brother();//diff pack.
	FamilyMem.sister();//diff pack.

	
	
	System.out.println("main method end");
}
public static void kadlag()
{
	System.out.println("running static method kadlag from same class");
}
public static void dhananjay()
{
	System.out.println("running static method dhananjay from same class");
}
}
