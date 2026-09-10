package com.LogicalStatements_IfElseIf;

import java.util.Scanner;

public class DayOfTheWeek {
	void result(int day) {
		if (day == 1) {
			System.out.println("It's a Sunday !! Enjoyy Darling........");
		} else if (day == 2) {
			System.out.println("It's Week day => Monday");
		} else if (day == 3) {
			System.out.println("Tuesday..........");
		} else if (day == 4) {
			System.out.println("Wednesday..........");
		} else if (day == 5) {
			System.out.println("Thursday...........");
		} else if (day == 6) {
			System.out.println("Friday...........");
		} else if (day == 7) {
			System.out.println("It's a week end...............");
			System.out.println("Saturday...........");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n******* Day's Category *********\n");
		System.out.println("Enter the Day : ");
		int day = sc.nextInt();

		DayOfTheWeek obj = new DayOfTheWeek();
		obj.result(day);
		sc.close();
	}
}
