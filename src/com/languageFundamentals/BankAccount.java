package com.languageFundamentals;

import java.math.BigInteger;
import java.util.Scanner;

public class BankAccount {
	BigInteger accountNumber;
	String customerName;
	double balance;

	double deposite(double amount) {
		balance += amount;
		return balance;
	}

	double withDrawal(double amount) {
		balance -= amount;
		return balance;
	}

	double transfer(double money) {
		balance -= money;
		return money;
	}

	double calculateInterest(float interestRate, float time) {
		double InterestAmount = (balance * interestRate * time) / 100;
		return InterestAmount;
	}

	void displayDetails() {

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// CUSTOMER 1 INFORMATION

		BankAccount c1 = new BankAccount();
		System.out.println("****************================****************");
		System.out.println("Enter Customer Name 1 : ");
		c1.customerName = sc.nextLine();

		System.out.println("Enter Account Number : ");
		c1.accountNumber = sc.nextBigInteger();

		System.out.println("Enter Deposite Amount : ");
		double Damount = sc.nextDouble();
		c1.deposite(Damount);

		System.out.println("Enter WithDrawal Amount : ");
		double Wamount = sc.nextDouble();
		c1.withDrawal(Wamount);

		System.out.println("Enter amount how much you want to transfer : ");
		double money = sc.nextDouble();
		c1.transfer(money);

		System.out.println("Enter your interest rate time : ");
		float time = sc.nextFloat();

		System.out.println("Enter interest rate for " + time + " years for Customer 1 :");
		float InterestRate = sc.nextFloat();

		float InAmount1 = (float) c1.calculateInterest(InterestRate, time);
		sc.nextLine();

		// CUSTOMER 2 INFORMATION

		BankAccount c2 = new BankAccount();
		System.out.println("\n ****************================****************");
		System.out.println("Enter Customer Name 2 :");
		c2.customerName = sc.nextLine();
		c2.balance += money;

		System.out.println("Enter interest time : ");
		float time2 = sc.nextInt();
		System.out.println("Enter interest rate for " + time2 + " years for Customer 2 : ");
		float InterestAmount2 = sc.nextFloat();
		float IntAmount2 = (float) c2.calculateInterest(InterestAmount2, time2);

		System.out.println("**************** => Customer 1 Details <= ****************");
		System.out.println("Customer Name : " + c1.customerName);
		System.out.println("Account Number : " + c1.accountNumber);
		System.out.println("Transfered Amount : " + money);
		System.out.println("Account Balance : " + c1.balance);
		System.out.println("Interested Amount for 2 years : " + InAmount1);

		System.out.println("\n **************** => Customer 2 Details <= ****************");
		System.out.println("Customer Balance : " + c2.balance);
		System.out.println("Interested Amount for 2 years : " + IntAmount2);

		sc.close();
	}

}
