package com.languageFundamentalsLoops;

import java.util.Scanner;

public class DecimalToBinary {

	static void toBinary(int num) {
		String str = "";
		int temp = num;
		while (num > 0) {
			int r = num % 2;
			num = num / 2;
			str = r + str;
		}

		System.out.println("Binary format of " + temp + " is : " + str);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n********* Decimal to Binary ************\n");
		System.out.println("Enter a number : ");
		int n = sc.nextInt();// 1010

		toBinary(n);
	}
}
