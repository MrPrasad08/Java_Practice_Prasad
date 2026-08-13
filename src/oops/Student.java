package oops;

public class Student {
	private int id;
	private String name;
	private String course;
	private int marks;

	Student(int id, String name, String course, int marks) {
		this.id = id;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}

	void displayStudent() {
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
		System.out.println("Course : " + course);
		System.out.println("Marks : " + marks);
		System.out.println(calculateResult());
		System.out.println("------------");
	}

	String calculateResult() {
		String Result;
		if (marks >= 40) {
			Result = "Pass";
		} else {
			Result = "Fail";
		}
		return Result;
	}

	public static void main(String[] args) {
		Student s1 = new Student(1, "Prasad", "CSE", 85);
		s1.displayStudent();
		Student s2 = new Student(2, "Akanksha", "DS", 98);
		s2.displayStudent();
		Student s3 = new Student(3, "Durga", "AI", 35);
		s3.displayStudent();
		Student s4 = new Student(4, "Bhavani", "Java", 70);
		s4.displayStudent();
		
	}
}
