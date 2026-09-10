package com.LogicalStatements.IfElse;

import java.util.Scanner;

public class EvenOdd {
	void evenOdd(int num) {
		if (num % 2 == 0) {
			System.out.println(num + " is Even !!");
		} else {
			System.out.println(num + " is Odd !!");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EvenOdd obj = new EvenOdd();
		System.out.println("********** Even Or Odd ************");
		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		obj.evenOdd(num);
		sc.close();
	}
}
