package com.passbyvalue;

public class PassByValue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =3;
		changePrimitive(a);
		System.out.println("Value of primitive a is: " + a);

		}

		public static void changePrimitive(int aCopy) {
		aCopy =13;
		}

}	
