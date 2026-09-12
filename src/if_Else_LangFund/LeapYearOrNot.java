package if_Else_LangFund;

import java.util.Scanner;

public class LeapYearOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year : ");
		int year = sc.nextInt();

		if ((year % 400 == 0) || (year % 4 == 0)) {
			System.out.println("Leap year : " + year);
		} else {
			System.out.println("Not a leap year !!");
		}
		sc.close();
	}
}
