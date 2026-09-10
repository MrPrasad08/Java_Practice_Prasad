package com.LogicalStatements.IfElse;

import java.util.Scanner;

public class Divisible10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbeer : ");
		int num = sc.nextInt();
		if (num % 10 == 0) {
			System.out.println("Nv cheppina number 10 tho divisible ayyithundii roiiii !!!");
		} else {
			System.out.println("Sarigga number chepu beyy !!");
		}
		sc.close();
	}
}
