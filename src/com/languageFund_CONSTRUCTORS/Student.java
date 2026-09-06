package com.languageFund_CONSTRUCTORS;

import java.util.Scanner;

public class Student {
	String name;
	int age;
	String course;

	Student() {
		Scanner sc = new Scanner(System.in);
		System.out.println("*******************No-args Constructor*******************\n");
		System.out.println("Enter your name : ");
		name = sc.nextLine();
		System.out.println("Enter your age :");
		age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your course : ");
		course = sc.nextLine();
		sc.close();
	}

	public static void main(String[] args) {
		Student obj = new Student();
		System.out.println("*********" + obj.name + " Details**************");
		System.out.println("Name : " + obj.name);
		System.out.println("Age : " + obj.age);
		System.out.println("Course : " + obj.course);
	}
}
