package com.languageFundamentalsLoops;

import java.util.Scanner;

public class DisariumNumber {

	static boolean isDisarium(int num) {
		boolean status = false;
		int length = Integer.toString(num).length();
		int sum = 0;
		int temp = num;
		while (num > 0) {
			int r = num % 10;
			sum = sum + ((int) (Math.pow(r, length)));
			length--;
			num = num / 10;
		}

		if (temp == sum) {
			status = true;
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n************ Disarium Number *************\n");
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		boolean status = isDisarium(n);
		if (status) {
			System.out.println(+n + " is a Disarium Number ");
		} else {
			System.out.println(+n + " Not disarium number ");
		}
		
		sc.close();
	}
}
