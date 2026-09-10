package com.LogicalStatements.IfElse;

import java.util.Scanner;

public class AttendanceAbove {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your attendence percentage : ");
		float attendance = sc.nextFloat();
		if (attendance >= 80) {
			System.out.println("You are Selected !!");
		}
		System.out.println("You are not selected !!");
		sc.close();
	}
}
