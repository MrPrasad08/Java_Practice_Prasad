package com.languageFund_CONSTRUCTORS;

public class Employee1 {
	String name;
	double salary;

	Employee1() {
		System.out.println("********Constructro from Manager Class**************");
	}

	Employee1(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	void main() {

	}
}

class Manager extends Employee1 {
	String department;
	int teamSize;

	Manager(String department, int teamSize) {
		this.department = department;
		this.teamSize = teamSize;
		super("Prasad", 350000.00);
	}

	void info() {
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);
		System.out.println("Department : " + department);
		System.out.println("Team Size  : " + teamSize);
	}

	public static void main(String[] args) {
		System.out.println("Main Method from Manager Class !!");
//		Manager obj1 = new Manager();
		Manager obj = new Manager("IT", 10);
		obj.info();
	}
}
