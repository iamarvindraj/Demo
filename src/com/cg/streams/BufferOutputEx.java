package com.cg.streams;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutputEx {

	public static void main(String[] args) {
		try {
			FileOutputStream fo = new FileOutputStream("D:\\New folder\\capgemini\\Core Java\\Hello.txt");
			BufferedOutputStream buffer = new BufferedOutputStream(fo, 4);
			
			buffer.write('A');
			buffer.write('B');
			buffer.write('C');
			buffer.write('D');
			buffer.write('E');
			System.out.println(5/0);
			buffer.write('F');
			buffer.write('G');
			buffer.write('H');
			//buffer.close();	
			System.out.println("Done....");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
