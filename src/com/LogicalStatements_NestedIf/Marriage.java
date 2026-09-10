package com.LogicalStatements_NestedIf;

import java.util.Scanner;

public class Marriage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Pellila Matrimony !!");
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		System.out.println("Enter your asserts : ");
		double asserts = sc.nextDouble();
		System.out.println("Enter your salary : ");
		double salary = sc.nextInt();

		if (asserts >= 100000000 && salary >= 2500000) {
			System.out.println("All good let's continue the discussion !!");
			System.out.println("Enter your age : ");
			int age = sc.nextInt();
			if (age >= 26 && age <= 29) {
				System.out.println("Okay let's continue the discussion !!");
			} else {
				System.out.println("Sorry babu !! You are to young or to old");
			}
		} else {
			System.out.println("Good byee !! ");
			System.out.println("Concentrate on your career !!");
		}
		sc.close();
	}
}
