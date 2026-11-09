package caseStudies;

import java.util.Scanner;

public class BikeRentalSystem {
	static Scanner sc = new Scanner(System.in);

	int bikeRent = 50;
	int bikesCount = 0;
	static int custCount = 0;
	float bikeHours = 0;

	void customers(int customerCount) {

		for (int i = 1; i <= customerCount; i++) {
			double totalCost = 0;
			System.out.println("For Customer " + i + " : ");
			System.out.println("Enter how many bike's want : ");
			bikesCount = sc.nextInt();
			for (int j = 1; j <= bikesCount; j++) {
				System.out.println("For Bike " + j + " : ");
				System.out.println("How many hour's you want : ");
				bikeHours = sc.nextFloat();
				if (bikeHours < 5) {
					bikeRent = bikeRent - 5;
					totalCost = totalCost + (bikeRent * bikeHours);
				} else {
					totalCost = totalCost + (bikeHours * bikeHours);
				}
			}
			System.out.println("\n******** Customer " + i + " ************");
			System.out.println("Total Bike's : " + bikesCount);
			System.out.println("Total Bill : " + totalCost);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.println("\n************** Bike Rental System ***************\n");
		BikeRentalSystem obj1 = new BikeRentalSystem();

		System.out.println("Enter how many customer's : ");
		custCount = sc.nextInt();
		obj1.customers(custCount);
	}
}
