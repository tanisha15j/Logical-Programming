package com.jsp.LogicalProgramming;

import java.util.Scanner;

public class CountDigit {
	public long countDigit(long n) {
		long count=0;
		while(n>0) {
			n/=10;
			count ++;
		}
		return count;
	}
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number");
	long n=sc.nextLong();
	CountDigit c= new CountDigit();
	System.out.println(c.countDigit(n));
}

}
