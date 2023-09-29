package com.jsp.LogicalProgramming;

import java.util.Scanner;
//Without using third variable

public class SwapNumbers {
	public static void swapNumbers(int a, int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping");
		System.out.println(a);
		System.out.println(b);
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		SwapNumbers.swapNumbers(a, b);
	}

}
