package if_Else_LangFund;

import java.util.Scanner;

public class MultipleOf3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		if (num % 3 == 0) {
			System.out.println(num + " is dividible by 3 !! ");
		} else {
			System.out.println(num + " is not Divisible by 3 !!");
		}
		sc.close();
	}
}
