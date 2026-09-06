package com.languageFund_CONSTRUCTORS;

import java.util.Scanner;

public class Persons_Emp_Man {
	String name;
	int age;

	Persons_Emp_Man(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class Employee2 extends Persons_Emp_Man {
	String empID;
	float salary;

	Employee2(String empID, float salary) {
		super("Prasad", 21);
		this.empID = empID;
		this.salary = salary;
	}
}

class Manager1 extends Employee2 {
	Scanner sc2 = new Scanner(System.in);

	String dept;
	int teamSize;

	Manager1(String dept, int teamSize) {
		super("S101", 890000);
		this.dept = dept;
		this.teamSize = teamSize;
	}

	void Info() {
		System.out.println("Name of the person : " + super.name);
		System.out.println("Age of the person : " + super.age);
		System.out.println("ID of the Employee : " + super.empID);
		System.out.println("Salary of the employee : " + super.salary);
		System.out.println("Department of the Manager : " + dept);
		System.out.println("Team Size of the Manager : " + teamSize);
	}

}

class Details {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("*********************Main Method from Details class**************");
		System.out.println("Enter your dept and teamSize : ");
		String dept = sc1.nextLine();
		int size = sc1.nextInt();
		sc1.nextLine();

		Manager1 obj = new Manager1(dept, size);
		obj.Info();
		sc1.close();
	}

}