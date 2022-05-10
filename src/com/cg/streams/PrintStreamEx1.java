package com.cg.streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamEx1 {
	public static void main(String[] args) {
		try {
			PrintStream p = new PrintStream(new FileOutputStream("D:\\New folder\\capgemini\\Core Java\\Data.txt"));
			p.println("Apple");
			p.print("mango");
			System.out.println("Done....:)");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
