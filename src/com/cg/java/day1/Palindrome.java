package com.cg.java.day1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number: ");
		
		int num = sc.nextInt();
		
		int pal = num;
		
		int rev = 0;
		
		while(num!=0) {
			rev = rev*10 + num%10;
			num = num / 10;
		}
		if(pal == rev) {
			System.out.println(pal+ " is a Palindrome");
		}
		else {
			System.out.println(pal+" is not a Palindrome");
		}
		
	}

}
