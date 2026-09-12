package if_Else_LangFund;

import java.util.Scanner;

public class BonusEligible {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary : ");
		double salary = sc.nextDouble();
		System.out.println("Enter your experience : ");
		float experience = sc.nextFloat();

		if (salary >= 40000 && experience >= 5) {
			System.out.println("Ewyuu !! Draling you are eligible to Bonus..............");
		} else {
			System.out.println("You are not eligible darling !!!...............");
		}
		sc.close();
	}
}
