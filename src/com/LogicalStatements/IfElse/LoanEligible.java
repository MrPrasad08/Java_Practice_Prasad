package com.LogicalStatements.IfElse;

import java.util.Scanner;

public class LoanEligible {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your income to check your loan : ");
		double income = sc.nextDouble();

		if (income >= 800000) {
			System.out.println("Ewyuuuu You are Eligible for Laon !!");
		} else {
			System.out.println("You are not eligible !!");
		}
		sc.close();
	}
}
