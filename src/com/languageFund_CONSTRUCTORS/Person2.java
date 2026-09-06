package com.languageFund_CONSTRUCTORS;

class Person2{
	String name;
	int age;
	String designation;

	Person2() {
		System.out.println("**************No - arg Constructor from Person2 class**************");
//		this("Prasad", 21, "Fresher");
	}

	Person2(String name, int age, String designation) {
		System.out.println("***************Constructor from Person 1 class ****************");
		this.name = name;
		this.age = age;
		this.designation = designation;
	}
	
	public static void main(String[] args) {
		
	}
}

class Student1 extends Person2 {
	int rollNo;
	String course;

//	Student1() {
//		this(101, "Java Full Stack");
//	}

	Student1(int rollNo, String course) {
		System.out.println("***************Constructor from Student 1 class ****************");
		super("Prasad", 21, "Fresher");
		this.rollNo = rollNo;
		this.course = course;
	}

	void showInfo() {
		System.out.println("Name of the Student : " + name);
		System.out.println("Age of the Student : " + age);
		System.out.println("Designation of the Student : " + designation);
		System.out.println("Roll No of the Student : " + rollNo);
		System.out.println("Course of the Student : " + course);
	}
	public static void main(String[] args) {
		Student1 obj = new Student1(101, "JFS");
		obj.showInfo();
	}

}
