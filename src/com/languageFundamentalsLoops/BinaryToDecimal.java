package com.languageFundamentalsLoops;

import java.util.Scanner;

public class BinaryToDecimal {

	static void toDecimal(long num) {
		long length = Long.toString(num).length();
		int count = 0;
		int sum = 0;

		while (count < length) {
			long r = num % 10;
			num = num / 10;
			sum = sum + ((int) ((Math.pow(2, count) * r)));
			count++;
		}

		System.out.println(sum);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n********* Binary To Decimal ********\n");
		System.out.println("Enter a binary number (0's & 1's): ");
		long n = sc.nextLong();

		toDecimal(n);
	}
}
