package com.languageFundamentalsLoops;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class BetweenPrimes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting number : ");
		int start = sc.nextInt();
		System.out.println("Enter ending number : ");
		int end = sc.nextInt();

		List<Integer> arr = primeNumber(start, end);

		System.out.println("***************************");

		for (int n : arr) {
			System.out.print(n + " ");
		}
		sc.close();
	}

	static List<Integer> primeNumber(int start, int end) {
		List<Integer> arr1 = new ArrayList<>();
		for (int i = start; i <= end; i++) {
			int count = 0;
			for (int j = 1; j <= i / 2; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 1) {
				arr1.add(i);
			}
		}
		return arr1;
	}
}
