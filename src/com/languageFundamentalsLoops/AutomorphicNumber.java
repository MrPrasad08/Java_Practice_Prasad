package com.languageFundamentalsLoops;

import java.util.Scanner;

public class AutomorphicNumber {
	static boolean isAutomorphic(int num) {
		boolean status = true;

		int res = num * num;

		while (num > 0) {
			int r = num % 10;
			int r2 = res % 10;

			if (r != r2) {
				return status = false;
			}

			num = num / 10;
			res = res / 10;
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n*********** Automorphic Number **************\n");
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		boolean status = isAutomorphic(n);
		if (status) {
			System.out.println(+n + " is a Automorphic Number ");
		} else {
			System.out.println(+n + " not a Automorphic Number ");
		}
		sc.close();
	}
}
