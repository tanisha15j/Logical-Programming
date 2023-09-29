package com.jsp.LogicalProgramming;


import java.util.Scanner;

public class Swapping {
	public static void swap(int a, int b) {
		int temp=a;
		a=b;
		b=temp;
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
		Swapping.swap(a, b);
		}

}
