package com.cg.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadingEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fi = new FileInputStream("D:\\New folder\\capgemini\\Core Java\\Data.txt");
			//int ch=fi.read();
			int ch = 0;
			while((ch=fi.read())!=-1){
				System.out.println((char)ch);
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
