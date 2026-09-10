package com.LogicalStatements.IfElse;

import java.util.Scanner;

public class ZeroOrNonzero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("********** Zero Or Non-Zero ************\n");
		System.out.println("Enter the number to check zero or non zero !! ");
		int num = sc.nextInt();
		if (num == 0) {
			System.out.println("Number is equal to Zero");
		} else {
			System.out.println("Number is not equal to Zero !!");
		}
		sc.close();
	}
}
