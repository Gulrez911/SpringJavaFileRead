package com.gul.test;

public class ArrayTwo {

	public static void main(String[] args) {
//		new ArrayTwo.myFunction(6);
		System.out.println(myFunction(6));
	}
	public static int myFunction(int n) {
		if(n<=1)
		{
			return n;
		}
		return myFunction(n-1)+myFunction(n-2);
	}
}
