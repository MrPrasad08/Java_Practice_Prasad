package com.languageFundamentalsLoops;

public class DigitsPrimes {

	static boolean isPrime(int i) {
		boolean status = true;

		if (i == 1 || i == 0) {
			return false;
		}
		for (int j = 2; j <= i / 2; j++) {
			if (i % j == 0) {
				status = false;
				break;
			}
		}
		return status;
	}

	static void digitsPrime(int num) {

		while (num > 0) {
			int digit = num % 10;
			if (isPrime(digit)) {
				System.out.print(digit + " ");
			}
			num = num / 10;	
		}
	}

	public static void main(String[] args) {
		System.out.println("******************");
		int n = 137259;

		digitsPrime(n);
	}
}
