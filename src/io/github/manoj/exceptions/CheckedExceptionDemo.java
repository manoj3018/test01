package io.github.manoj.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionDemo {
	
	public static void main(String[] args) throws FileNotFoundException,IOException {
		
		FileReader file = new FileReader("C:\\test\\a.txt");
		BufferedReader fileInput = new BufferedReader(file);
		
		//Print first three lines of file "C:\test\a.txt"
		
		for (int counter=0; counter <3; counter++) {
			System.out.println(fileInput.readLine());
		}
		fileInput.close();
		
		// throw new MyException()
	}

}
