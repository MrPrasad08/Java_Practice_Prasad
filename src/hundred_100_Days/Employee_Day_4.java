package hundred_100_Days;

public class Employee_Day_4 {
	int Emp_Id;
	String Emp_Name;
	float Emp_Sal;

	public static void main(String[] args) {
		Employee_Day_4 e1 = new Employee_Day_4();
		e1.Emp_Id = 101;
		e1.Emp_Name = "Prasad";
		e1.Emp_Sal = 35000;
		System.out.println("Employee ID : " + e1.Emp_Id);
		System.out.println("Employee Name : " + e1.Emp_Name);
		System.out.println("Employee Salary : " + e1.Emp_Sal);
		System.out.println();
		Employee_Day_4 e2 = new Employee_Day_4();
		e2.Emp_Id = 102;
		e2.Emp_Name = "Durga";
		e2.Emp_Sal = 28000;
		System.out.println("Employee ID : " + e2.Emp_Id);
		System.out.println("Employee Name : " + e2.Emp_Name);
		System.out.println("Employee Salary : " + e2.Emp_Sal);
	}
}
