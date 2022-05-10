package com.java;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arms, cubeSum = 0, num, r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number: ");
		
		arms = sc.nextInt();
		num = arms;
		
		while(num > 0) {
			r = num % 10;
			cubeSum = cubeSum + (r*r*r);
			num = num/10;
		}
		if(arms == cubeSum) {
			System.out.println(arms+ " is a Armstrong Number");
		}
		else {
			System.out.println(arms+ " is not a Armstrong Number");
		}
//		sc.close();

	}

}
