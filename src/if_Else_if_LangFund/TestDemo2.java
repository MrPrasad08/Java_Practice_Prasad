package com.LogicalStatements_IfElseIf;

import java.util.Scanner;

public class TestDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any three number : !!");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a < b && a < c) {
			System.out.println("A (" + a + ") is SMALL ");
		} else if (b < a && b < c) {
			System.out.println("B (" + b + ") is SMALL ");
		} else {
			System.out.println("C (" + c + ") is SMALL ");
		}
		sc.close();
	}
}
