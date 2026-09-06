package com.languageFund_CONSTRUCTORS;

import java.util.Scanner;

public class Chain_Constructor_User {
	static Scanner sc = new Scanner(System.in);
	String name;
	int age;
	String designation;
	String location;
	float salary;

	Chain_Constructor_User() {
		System.out.println("Enter your name :");
		String name = sc.nextLine();
		this(name);
	}

	Chain_Constructor_User(String name) {
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		sc.nextLine();
		this(name, age);
	}

	Chain_Constructor_User(String name, int age) {
		System.out.println("Enter your desgination : ");
		String designation = sc.nextLine();
		this(name, age, designation);
	}

	Chain_Constructor_User(String name, int age, String designation) {
		System.out.println("Enter your location : ");
		String location = sc.nextLine();
		this(name, age, designation, location);
	}

	Chain_Constructor_User(String name, int age, String designation, String location) {
		System.out.println("Enter your salary : ");
		float salary = sc.nextFloat();
		this(name, age, designation, location, salary);
	}

	Chain_Constructor_User(String name, int age, String designation, String location, float salary) {
		this.name = name;
		this.age = age;
		this.designation = designation;
		this.location = location;
		this.salary = salary;
		Info();
	}

	void Info() {
		System.out.println("*******************Mr-" + name + " Details******************");
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Designation : " + designation);
		System.out.println("Location : " + location);
		System.out.println("Salary : " + salary);
	}

	public static void main(String[] args) {
		new Chain_Constructor_User();
		sc.close();
	}
	
}
