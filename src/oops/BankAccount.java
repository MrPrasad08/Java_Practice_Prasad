package oops;

import java.util.Scanner;

public class BankAccount {
	static Scanner sc = new Scanner(System.in);
	private static long accountNumber;
	public static String accountHolderName;
	private static double balance;
	int amount;

	void userDetails() {
		System.out.println("Name : " + accountHolderName);
		System.out.println("Account Number : " + accountNumber);
	}

	double deposite() {
		System.out.println("Enter the amount to deposite : ");
		amount = sc.nextInt();
		if (amount < 0) {
			System.out.println("Enter the correct amount must be positive");
		} else {
			balance += amount;
			System.out.println("Deposite Successfull !!!!");
			System.out.println("If you want to exit enter 5 !!!");

		}
		return balance;
	}

	void withDrawal() {
		System.out.println("Enter withdrawal amount :");
		amount = sc.nextInt();
		if (amount > balance) {
			System.out.println("Insufficient balance");
		} else {
			balance -= amount;
			System.out.println("Withdrawal Successful !!");
		}
	}

	void checkBalance() {
		System.out.println("Your Balance is : " + balance);
	}

	void menu() {
		System.out.println();
		System.out.println("1.User Details \n2.Deposite \n3.Withdrawal \n4.Check Balance \n5.Exit");
		System.out.println();
		System.out.println("Enter the option what do you want : ");
		System.out.println();
	}

	public static void main(String[] args) {
		BankAccount obj1 = new BankAccount();
		System.out.println("Enter your name : ");
		accountHolderName = sc.nextLine();
		System.out.println("Enter your account number : ");
		accountNumber = sc.nextLong();
		while (true) {
			obj1.menu();
			int key = sc.nextInt();
			switch (key) {
			case 1:
				obj1.userDetails();
				break;
			case 2:
				obj1.deposite();
				break;
			case 3:
				obj1.withDrawal();
				break;
			case 4:
				obj1.checkBalance();
				break;
			case 5:
				System.out.println("Thank You !!");
				return;
			default:
				System.out.println("Enter the valid option !!!");
			}
		}
	}
}
