package com.languageFund_CONSTRUCTORS;

import java.util.Scanner;

public class Employee {

	Employee(int id, String name, float salary) {
		System.out.println("***********Parameterized Constructor************\n");
		System.out.println("****** => " + name + " Details <= *********");
		System.out.println("Name : " + name);
		System.out.println("ID : " + id);
		System.out.println("Salary : " + salary);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your ID :");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your name :");
		String name = sc.nextLine();

		System.out.println("Enter your salary :");
		float salary = sc.nextFloat();

		new Employee(id, name, salary);
		
		sc.close();
	}
}
