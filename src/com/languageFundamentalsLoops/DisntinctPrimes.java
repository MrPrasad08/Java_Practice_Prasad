package com.languageFundamentalsLoops;

public class DisntinctPrimes {

	static boolean isPrime(int i) {
		boolean status = true;
		if (i == 0 || i == 1) {
			return false;
		}
		for (int k = 2; k < i; k++) {
			if (i % k == 0) {
				status = false;
				break;
			}
		}
		return status;
	}

	static int factors(int n) {

		int ele = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				if (isPrime(i)) {
					ele = i;
				}
			}
		}
		return ele;
	}

	public static void main(String[] args) {
		System.out.println("\n************ Distinct Prime's ***********\n");
		int num = 4;

		int a  =factors(num);
		System.out.println(a);
	}
}
