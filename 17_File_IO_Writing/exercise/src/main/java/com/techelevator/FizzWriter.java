package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What's the file path homie?");
		String filePath = scanner.nextLine();
try{
	FizzWriter.FizzyBoi(filePath);
} catch (FileNotFoundException e){
	System.err.println("File not found silly, try again");
}
	}
public static void FizzyBoi(String filePath) throws FileNotFoundException {
		File fizzFile = new File(filePath);
	PrintWriter dataOutput = new PrintWriter(fizzFile);
	for (int n = 1; n <=300; n++){
		if (n%3==0 && n%5==0 ){
			dataOutput.println("FizzBuzz");
		}
		else if ( n%3==0){
			dataOutput.println("Fizz");
		}
		else if (n%5==0){
			dataOutput.println("Buzz");
		}
		else{
			dataOutput.println(n);
		}

	}
	dataOutput.close();
}
}
