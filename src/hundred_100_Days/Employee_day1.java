package hundred_100_Days;

import java.util.Scanner;

class Employee {
	int id;
	String name;
	float salary;

	Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void display() {
		System.out.println("Employee ID : " + id);
		System.out.println("Employee Name : " + name);
		System.out.println("Employee Salary : " + salary);
	}
}

public class Employee_day1 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter count of members : ");
		int count = sc.nextInt();
		Employee[] arr = new Employee[count];

		for (int i = 0; i < count; i++) {
			System.out.println("Enter ID :");
			int id = sc.nextInt();
			System.out.println("Enter Name :");
			String name = sc.nextLine();
			sc.nextLine();
			System.out.println("Enter Salary :");
			float salary = sc.nextFloat();

			arr[i] = new Employee(id, name, salary);
		}
	}
}
