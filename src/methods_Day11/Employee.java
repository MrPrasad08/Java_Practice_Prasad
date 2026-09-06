package methods_Day11;

public class Employee {
	// no return type + no parameter
	void greet() {
		System.out.println("Hii !! How are you");
	}

	void getName() {
		System.out.println("Name : " + "Prasad");
	}

	void getJob() {
		System.out.println("Job : " + "SoftWare Engineer");
	}

	void getAge() {
		System.out.println("Age : " + 22);
	}

	void getSalary() {
		System.out.println("Salary : " + 670000);
	}

	void getStatus() {
		System.out.println("Status : " + "Active");
	}

	public static void main(String[] args) {
		Employee obj = new Employee();
		System.out.println("Heyy Welcome !!\n");
		obj.greet();
		obj.getName();
		obj.getJob();
		obj.getAge();
		obj.getSalary();
		obj.getStatus();
		System.out.println("\nThank Youu ❤️");
	}
}
