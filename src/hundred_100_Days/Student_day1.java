package hundred_100_Days;

public class Student_day1 {
	int id;
	String name;
	String course;
	float fee;

	void display() {
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
		System.out.println("Course : " + course);
		System.out.println("Fee : " + fee);
	}

	public static void main(String[] args) {
		Student_day1 s1 = new Student_day1();
		s1.id = 101;
		s1.name = "Prasad";
		s1.course = "Java";
		s1.fee = 35000;
		s1.display();
	}
}
