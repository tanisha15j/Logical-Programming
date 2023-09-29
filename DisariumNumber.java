package com.jsp.LogicalProgramming;

import java.util.Scanner;

public class DisariumNumber {
	public static boolean isDisarium(int n) {
		int sum=0;  int count=0; int z=n;
		while(z>0) {
			z=z/10;
			count++;
		}
		z=n;
		while(z>0) {
			int pro=1;
			int lastdigit=z%10;
			for(int i=1;i<=count;i++) {
				pro=pro*lastdigit;
			}
			count--;
			sum=sum+pro;
			z=z/10;
		}
		if(sum==n) {
			return true;
		} else {
			return false;
		}
	}

	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		System.out.println(isDisarium(n));
	}
	

}
