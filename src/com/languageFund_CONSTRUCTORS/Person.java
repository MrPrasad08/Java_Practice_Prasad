package com.languageFund_CONSTRUCTORS;

public class Person {
	String name;
	int age;
	String city;
	float salary;

	Person() {
		System.out.println("**************No - A Con*************");
		Info();
	}

	Person(String name) {
		System.out.println("**************1 - A Con*************");
		this.name = name;
		Info();
	}

	Person(String name, int age) {
		System.out.println("**************2 - A Con*************");
		this.name = name;
		this.age = age;
		Info();
	}

	Person(String name, int age, String city) {
		System.out.println("**************3 - A Con*************");
		this.name = name;
		this.age = age;
		this.city = city;
		Info();
	}

	Person(String name, int age, String city, float salary) {
		System.out.println("**************4 - A Con*************");
		this.name = name;
		this.age = age;
		this.city = city;
		this.salary = salary;
		Info();
	}

	void Info() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("City : " + city);
		System.out.println("Salary : " + salary);
	}

	public static void main(String[] args) {
		new Person();
		new Person("Prasad !!");
		new Person("Durga", 21);
		new Person("Akanksha", 20, "Hyd");
		new Person("SAP", 01, "Home", 2000000);
	}
}
