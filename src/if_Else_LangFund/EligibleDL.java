package if_Else_LangFund;

import java.util.Scanner;

public class EligibleDL {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*********** Eligible for Driving Licence ***************");
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		System.out.println("Driving vachha ??");
		boolean status = sc.nextBoolean();
		if (age >= 18 && status) {
			System.out.println("Thadii laa vunna inka driving license ledaa entra niku mundu pettukoni eduu !!");
		} else {
			System.out.println("Gudhaa naa kodaka Mundu pedda manishivi avvu !!");
			System.out.println("Tharuvutha Drinving Nerchukundakaniiii !!");
		}
		sc.close();
	}
}
