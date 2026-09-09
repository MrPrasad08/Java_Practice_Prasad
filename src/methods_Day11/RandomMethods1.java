package methods_Day11;

class Student {
	int rollNo;
	String name;
	int age;
	String branch;
}

public class RandomMethods1 {
//	Integer method1() {
//		Double x = 10.23;
//		return (int) x;
//	}

	int method2() {
		float f = 12.32f;
		return (int) f;
	}

	char method3() {
		int a = 65;
		return (char) a;
	}
	

	Student getDetails(int rollNo, String name, int age, String branch) {
		Student std = new Student();
		std.rollNo = rollNo;
		std.name = name;
		std.age = age;
		std.branch = branch;
		return std;
	}

	public static void main(String[] args) {
		RandomMethods1 obj = new RandomMethods1();

		char ch = obj.method3();
		System.out.println(ch);
		Student obj1 = obj.getDetails(201, "Prasad", 21, "CSE");
		System.out.println("Age : " + obj1.age);
		System.out.println("Name : " + obj1.name);
		System.out.println("Roll No : " + obj1.rollNo);
		System.out.println("Branck : " + obj1.branch);
	}
}
