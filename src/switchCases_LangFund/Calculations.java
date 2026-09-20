package switchCases_LangFund;

import java.util.Scanner;

public class Calculations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("********** Basic Maths Operations *************\n");
		System.out.println("Enter any two operations : ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		String ch = "";
		
		do {

			System.out.println("\nEnter operation symbol (+ * / % - ^) to calculate : ");
			String sym = sc.next();

			switch (sym) {
			case "+":
				System.out.println("Addition (+) is : " + (a + b));
				break;
			case "-":
				System.out.println("Subtraction (-) is : " + (a - b));
				break;
			case "*":
				System.out.println("Multiplication (*) is : " + (a * b));
				break;
			case "/":
				System.out.println("Division (/) is : " + (a / b));
				break;
			case "%":
				System.out.println("Modules (%) is : " + (a % b));
				break;
			case "^":
				int count = 1;
				int res = 1;
				while (count <= b) {
					res = (int) (res * a);
					count++;
				}
				System.out.println("Power (^) of a, b is : " + (res));
			default:
				System.out.println("Enter a valid Symbol !!");
			}
			System.out.println("Do you want to continue.....?? (y/n)");
			ch = sc.next();
		} while (ch.equalsIgnoreCase("y"));
		System.out.println("Thank Your !!! Exit....");
		sc.close();
		
	}
}
