package oops;

import java.util.Scanner;

public class UserDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account acc = new Account();
		System.out.println("Enter Your Name : ");
		String user = sc.nextLine();
		acc.setName(user);
		System.out.println("Enter Your Account Number : ");
		long accountNo = sc.nextLong();
		acc.setAccountNumber(accountNo);
		ATMInterface atm = new ATMInterface(acc);
		long amount;
		while (true) {
			atm.menu();
			int key = sc.nextInt();
			switch (key) {
			case 1:
				atm.details();
				break;
			case 2:
				System.out.println("Enter the amount to deposite :");
				amount = sc.nextLong();
				atm.deposite(amount);
				break;
			case 3:
				System.out.println("Enter Withdrawal Amount : ");
				amount = sc.nextLong();
				atm.withdrawal(amount);
				break;
			case 4:
				atm.checkBalance();
				break;
			case 5:
				System.out.println("You are Exit !!");
				System.out.println("Thank Youu !!");
				return;
			default:
				System.out.println("Enter the valid option !!");
				break;
			}
		}
	}
}
