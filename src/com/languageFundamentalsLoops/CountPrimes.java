package com.languageFundamentalsLoops;

import java.util.Scanner;

public class CountPrimes {

	static boolean isPrime(int num) {
		boolean status = true;
		if (num == 0 || num == 1) {
			return false;
		}

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				status = false;
				break;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		System.out.println("\n************ Count Prime's ************\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start number : ");
		int start = sc.nextInt();
		System.out.println("Enter end number : ");
		int end = sc.nextInt();

		int count = 0;
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				count++;
			}
		}
		System.out.println("Prime Number's between " + start + " and " + end + " : " + count);

		sc.close();
	}
}
