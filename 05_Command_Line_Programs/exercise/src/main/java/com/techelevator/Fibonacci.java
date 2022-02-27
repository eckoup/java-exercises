package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("how many numbers to include in Fibonacci Sequence");
		int n = scanner.nextInt();

		System.out.println("Fibonacci Series");
		System.out.print(first + "," + second + ",");
		int next;
		for (int i = 2; i < n; i++) { //add those babies up
			next = first + second;
			System.out.print(next + ",");
			first = second;
			second = next;
		}
	}
}




