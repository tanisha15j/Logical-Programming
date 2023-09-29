package com.jsp.LogicalProgramming;

import java.util.Scanner;

public class Power {
	public static int isPower(int base,int exponent){
		int power=1;
				for(int i=1;i<=exponent;i++) {
					power=power*base;
				}
				return power;
	}

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a base number");
		int base=sc.nextInt();
		System.out.println("Enter a exponent number");
		int exponent=sc.nextInt();
		int pow=isPower(base, exponent);
		System.out.println(base +" to the power " +exponent + " is: "+pow);
	}

}
