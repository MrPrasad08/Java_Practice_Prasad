package com.languageFundamentalsLoops;

import java.util.ArrayList;

import java.util.Scanner;

public class FactorsOfNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num = sc.nextInt();

		ArrayList<Integer> factors = factorsList(num);
		System.out.println("\nFactors of " + num + " is :");
		for (int fact : factors) {
			System.out.print(fact + " ");
		}
		sc.close();
	}

	static ArrayList<Integer> factorsList(int num) {
		ArrayList<Integer> array = new ArrayList<>();
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				array.add(i);
				sum += i;
			}
		}
		if (sum == num) {
			System.out.println("Perfect Number : " + sum + " & " + num);
		} else {
			System.out.println("Not Perfect");
		}
		return array;
	}
}
