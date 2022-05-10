package com.cg.streams;

import java.io.File;
import java.sql.Date;

public class FileEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\New folder\\capgemini\\Core Java\\Data.txt");
		System.out.println("Is it a folder ? "+file.isDirectory());
		System.out.println("Is it a file ? "+file.isFile());
		System.out.println("Is it a hidden file " +file.isHidden());
		long lastModified=file.lastModified();
		Date d = new Date(lastModified);
		System.out.println("Last Modified Date is: "+d);
		
		long filesize = file.length();
		System.out.println("file size (in bytes) " + filesize);

	}

}
