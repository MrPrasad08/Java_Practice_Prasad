package com.LogicalStatements.IfElse;

import java.util.Scanner;

public class SpecifiedRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("********* Specified Range or Not **************");
		System.out.println("Enter the number between 10 and 50 : ");
		int num = sc.nextInt();
		if(num >=10 && num <=50) {
			System.out.println("Your number is in correct range !!");
		}
		else {
			System.out.println("Out of Range reyy !!!");
		}
		sc.close();
	}
}
