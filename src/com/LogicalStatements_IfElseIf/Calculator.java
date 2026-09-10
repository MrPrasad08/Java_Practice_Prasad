package com.LogicalStatements_IfElseIf;

import java.util.Scanner;

public class Calculator {
	static Scanner sc = new Scanner(System.in);

	Calculator(int a, int b) {
		System.out.println("Enter operation : ");
		char ch = sc.next().charAt(0);
		System.out.println(ch);

		if (ch == '+') {
			System.out.println("Sum is : " + (a + b));
		} else if (ch == '-') {
			System.out.println("Substraction is : " + (a - b));
		} else if (ch == '/') {
			System.out.println("Division is : " + (a / b));
		} else if (ch == '*') {
			System.out.println("Division is : " + (a * b));
		} else if (ch == '%') {
			System.out.println("Division is : " + (a % b));
		} else {
			System.out.println("Babu Bangaram operation symbol sarigga enter cheyu amma !!");
		}
	}

	public static void main(String[] args) {
		System.out.println("************ Calculations ****************\n");
		System.out.println("Enter any two number : ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		new Calculator(a, b);
		sc.close();
	}
}
