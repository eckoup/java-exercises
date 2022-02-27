package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	int binaryNumber[] = new int[40];
	int index = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter in a series of decimal (separated by spaces): ");
		String value = scanner.nextLine();
		String[] userInput = value.split(" ");

		for (int i = 0; i < userInput.length; i++){
			int inputNumber = Integer.parseInt((userInput[i]));  //parse to int
			System.out.print(inputNumber + " in binary is ");

			decimalToBinary(inputNumber);
			System.out.println(" ");
		}
	}
	public static void decimalToBinary(int inputNumber){
		int binaryNumber[] = new int[40];
		int index = 0;

		while (inputNumber > 0){
			binaryNumber[index ++] = inputNumber % 2 ;
			inputNumber = inputNumber / 2;
		}
		for (int i = index - 1; i >= 0; i--){
			System.out.print(binaryNumber[i]);
		}


}
}
//put into an array

//use loop