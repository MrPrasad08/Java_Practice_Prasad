package com.languageFund_CONSTRUCTORS;

public class Student_Chain {
	String name;
	int age;
	int rollNo;

	Student_Chain() {
		System.out.println("*************No-args Constructor***************");
		this("Prasad");
	}

	Student_Chain(String name) {
		System.out.println("**************1-args Constructor*****************");
		this(name, 21);
	}

	Student_Chain(String name, int age) {
		System.out.println("**************2-args Constructor****************");
		this(name, age, 202);
	}

	Student_Chain(String name, int age, int rollNo) {
		System.out.println("*************3-args Constructor*****************\n");
		this.name = name;
		this.age = age;
		this.rollNo = rollNo;
	}

	public static void main(String[] args) {
		System.out.println("*************** => Started <= *****************\n");
		Student_Chain obj = new Student_Chain();
		System.out.println("Name : " + obj.name);
		System.out.println("Age : " + obj.age);
		System.out.println("Roll No : " + obj.rollNo);

		System.out.println("\n*************** => Ended <= *****************");
	}

}
