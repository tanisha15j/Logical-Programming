package com.jsp.LogicalProgramming;

import java.util.Scanner;

public class PerfectNumber {
	public static boolean isperfect(int n){
		int sum=0;
		//to find factors
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==n) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		System.out.println(isperfect(n));
		
	}

}
