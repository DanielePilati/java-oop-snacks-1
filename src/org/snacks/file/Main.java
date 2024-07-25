package org.snacks.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String data = "";
	    try {
	    	File textFile = new File("readme.txt");
			Scanner scanner = new Scanner(textFile);
			data = scanner.nextLine();
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		}
	    System.out.println(data);
		
	}

}
