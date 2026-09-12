package if_Else_LangFund;

import java.util.Scanner;

public class EligibleForFreeDelivery {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("********** Eligible For Free Delivery ******************");
		System.out.println("Enter your cart total : ");
		float total = sc.nextFloat();
		if(total >= 500) {
			System.out.println("You are Eligible for free delivery !!");
		}
		else {
			System.out.println("You are not eliigible darling !!!");
		}
		sc.close();
	}
}
