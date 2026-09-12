package if_Else_LangFund;

import java.util.Scanner;

public class BalWithdrawal {
	public static void main(String[] args) {
		double balance = 200000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your withdrawal amount : ");
		double amount = sc.nextDouble();
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal Successfull !!");
			System.out.println("Balance : " + balance);
		} else {
			System.out.println("Insufficient Balance !!");
		}
		sc.close();
	}
}
