package if_Else_LangFund;

import java.util.Scanner;

public class PositiveNegative {

	void posNeg(int num) {
		if (num < 0) {
			System.out.println(num + " is Negative !!");
		} else {
			System.out.println(num + " is Positive !!");
		}
	}

	public static void main(String[] args) {
		System.out.println("******* Positive or Negative *********");
		Scanner sc = new Scanner(System.in);
		PositiveNegative obj = new PositiveNegative();
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		obj.posNeg(num);
		sc.close();
	}
}
