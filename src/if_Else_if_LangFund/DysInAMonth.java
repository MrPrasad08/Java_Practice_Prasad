package com.LogicalStatements_IfElseIf;

import java.util.Scanner;

public class DysInAMonth {
	void noOfDays(String month, int num) {
		month = month.toLowerCase();

		if (month.equals("january") || num == 1) {
			System.out.println(month + " has 31 days !!");
		} else if (month.equals("february") || num == 2) {
			System.out.println(month + " has 28 days !!");
		} else if (month.equals("march") || num == 3) {
			System.out.println(month + " has 31 days !!");
		} else if (month.equals("april") || num == 4) {
			System.out.println(month + " has 30 days !!");
		} else if (month.equals("may") || num == 5) {
			System.out.println(month + " has 31 days !!");
		} else if (month.equals("june") || num == 6) {
			System.out.println(month + " has 30 days !!");
		} else if (month.equals("july") || num == 7) {
			System.out.println(month + " has 31 days !!");
		} else if (month.equals("august") || num == 8) {
			System.out.println(month + " has 31 days !!");
		} else if (month.equals("september") || num == 9) {
			System.out.println(month + " has 30 days !!");
		} else if (month.equals("october") || num == 10) {
			System.out.println(month + " has 31 days !!");
		} else if (month.equals("november") || num == 11) {
			System.out.println(month + " has 30 days !!");
		} else if (month.equals("december") || num == 12) {
			System.out.println(month + " has 31 days !!");
		} else {
			System.out.println("Evadra nuvvu intha talented gaa vunnav !!");
			System.out.println("months ki months number ki theda teliyatleduu !!");
			System.out.println("school ki poyii saduvukoo !! aaduko amma velli velu......");
		}
	}

	public static void main(String[] args) {
		System.out.println("********* Days in a month ***********");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month name or month number : ");
		String month = sc.nextLine();
		int num = sc.nextInt();
		sc.nextLine();

		DysInAMonth obj = new DysInAMonth();
		obj.noOfDays(month, num);
		sc.close();
	}
}
