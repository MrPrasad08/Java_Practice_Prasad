package if_Else_LangFund;

import java.util.Scanner;

public class EqualorNot {
	public static void main(String[] args) {
		System.out.println("********** Equal or Not *************");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number : ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number :");
		int b = sc.nextInt();

		if (a == b) {
			System.out.println("Nv ichhina Two Numbers same roiii !!");
		} else {
			System.out.println("Sarigga numbers enter cheyyu ok naa !!");
		}
		sc.close();
	}
}
