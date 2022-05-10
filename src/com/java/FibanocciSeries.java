package com.java;

import java.util.Scanner;

public class FibanocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t1 = 0, t2 = 1, fib;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number: ");
		
		fib = sc.nextInt();
		
		for(int i=0;i<fib;i++) {
			
			System.out.println(t1);
			
			int t3 = t1+t2;
			t1 = t2;
			t2 = t3;
			
			
		}
		
		
		

	}

}
