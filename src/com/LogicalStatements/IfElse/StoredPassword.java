package com.LogicalStatements.IfElse;

import java.util.Scanner;

public class StoredPassword {
	public static void main(String[] args) {
		String password = "Durga@070804";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your password : ");
		String userPassword = sc.nextLine();
		if (userPassword.equals(password)) {
			System.out.println("Password Matched !!");
		} else {
			System.out.println("Invalid Password !!");
		}
		sc.close();
	}
}
