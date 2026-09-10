package com.LogicalStatements.IfElse;

import java.util.Scanner;

public class StudentGrade {
	public static void main(String[] args) {
		System.out.println("************ Student Grade Calculator ***************");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks : ");
		int marks = sc.nextInt();

		if (marks > 100 || marks < 0) {
			System.out.println("Please enter the valid marks !!");
		} else if (marks >= 90 && marks <= 100) {
			System.out.println("Awesome !! Your Grade is A");
		} else if (marks >= 75 && marks < 90) {
			System.out.println("Good !! Your Grade is B ");
		} else if (marks >= 60 && marks < 74) {
			System.out.println("Better !! Your Grade is C ");
		} else if (marks >= 40 && marks < 60) {
			System.out.println("Average !! Your Grade is D ");
		} else {
			System.out.println("Better Luck next time !! You are fail");
		}
		sc.close();
	}
}
