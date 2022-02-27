package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double C=0;
		double F=0;
		double input;
		char selection;
		System.out.println("Please enter the temperature:");
		input = scanner.nextDouble();
		System.out.println("Is the temperature in (C)elsius, or (F)ahrenheit?");
		selection = scanner.next().charAt(0);
		if (selection == 'C' || selection == 'c') {
		C = input;
			F = C * (1.8 + 32);
		}else if (selection == 'F' || selection == 'f'){
			F = input;
			C = (F - 32) / 1.8;
		}
		System.out.println(F + " degree Fahrenheit is equal to " + C + " degree Celsius.");
	}
}




