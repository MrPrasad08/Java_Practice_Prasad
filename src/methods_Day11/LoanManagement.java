package methods_Day11;

import java.util.Scanner;

public class LoanManagement {
//	String customerName;
	static double LoanAmount;
//	float interestRate = 2.0f;
	static int Time;

	float calculateInterest(double loanAmount, float InterestRate) {
		int time = Time;
		float rateOfInterest = (float) ((loanAmount * InterestRate * time) / 100);
		return rateOfInterest;
	}

	double calculateTotalAmount(float interest) {
		double amount = LoanAmount;
		double totalAmount = amount + interest;
		return totalAmount;
	}

	float calculateMonthlyEMI(double totalAmount, int time) {
		int months = time * 12;
		float EMI = (float) (totalAmount / months);
		return EMI;
	}

	void displayLoamSummary(String name, double ACamount, float interest, double totalAmount, float EMI) {
		System.out.println("\n*********************Over All Loan Summary************************");
		System.out.println("Customer Name : " + name);
		System.out.println("Actual Amount by customer : " + ACamount);
		System.out.println("Rate of Interest for loan amount : " + interest);
		System.out.println("Total Amount with interest : " + totalAmount);
		System.out.println("Monthly EMI : " + EMI);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LoanManagement cus1 = new LoanManagement();

		System.out.println("****************Loan Management*******************");
		System.out.println("Enter your name : ");
		String customerName = sc.nextLine();
		System.out.println("Enter the amount what do you wnat...........");
		LoanAmount = sc.nextDouble();
		System.out.println("Enter the interest rate......");
		float InterestRate = sc.nextFloat();
		System.out.println("How many years you want.......");
		Time = sc.nextInt();

		float rOI = cus1.calculateInterest(LoanAmount, InterestRate);
		System.out.println("\n*****************Rate of Interest*******************");
		System.out.println("Your Name : " + customerName);
		System.out.println("Interest Per Year : " + rOI);

		double amount = cus1.calculateTotalAmount(rOI);
		System.out.println("\n*****************Total Amount*******************");
		System.out.println("Total Loan Amount : " + amount);

		float monthlyEmI = cus1.calculateMonthlyEMI(amount, Time);
		System.out.println("\n*****************Monthly EMI*******************");
		System.out.println("Monthly EMI : " + monthlyEmI + " per month");

		cus1.displayLoamSummary(customerName, LoanAmount, rOI, amount, monthlyEmI);
		sc.close();

	}
}
