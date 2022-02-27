package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double m=0;
		double f=0;
		double input;
		char selection;
		System.out.println("Please enter the length");
		input = scanner.nextDouble();
		System.out.println("Is the measurement in (m)eter, or (f)eet?");
		selection = scanner.next().charAt(0);
		if (selection == 'm'|| selection == 'M') {
			m = input;
			f = m * 3.2808399;
		}else if (selection == 'f'|| selection == 'F'){
			f = input;
			m = f * 0.3048;
		}
	System.out.println(m + "m" + " " + "is" + " " + f + "f");
	}



}

