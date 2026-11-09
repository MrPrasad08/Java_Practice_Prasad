package com.languageFundamentalsLoops;

import java.util.Scanner;

public class HappyNumber {

	static int happyNum(int num) {
		int res = 0;
		while (num != 0) {
			int ele = num % 10;
			res = res + (ele * ele);
			num = num / 10;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n********** HAPPY NUMBER **********\n");
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		int result = happyNum(n);
		int i = 0;
		while (result != 1) {
			i++;
			result = happyNum(result);
			System.out.println(i + "th square's sum : " + result);
		}

		if (result == 1) {
			System.out.println("\nThe Given " + n + " is Happy");
		} else {
			System.out.println("Not happy");
		}
		
		sc.close();
	}
}
