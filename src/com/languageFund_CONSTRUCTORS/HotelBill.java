package com.languageFund_CONSTRUCTORS;

import java.util.Scanner;

public class HotelBill {
	static Scanner sc = new Scanner(System.in);

	String roomType;
	int numberOfDays;
	float roomPrice;
	float foodCharges;

	HotelBill() {
		System.out.println("Enter your Room Type : ");
		String roomType = sc.nextLine();
		this(roomType);
	}

	HotelBill(String roomType) {
		System.out.println("Number of Days you will stay : ");
		int numberOfDays = sc.nextInt();
		this(roomType, numberOfDays);
	}

	HotelBill(String roomType, int numberOfDays) {
		System.out.println("Enter Room Price for each day : ");
		float roomPrice = sc.nextFloat();
		this(roomType, numberOfDays, roomPrice);
	}

	HotelBill(String roomType, int numberOfDays, float roomPrice) {
		System.out.println("Enter Food Charges per day : ");
		float foodCharges = sc.nextFloat();
		this(roomType, numberOfDays, roomPrice, foodCharges);
	}

	HotelBill(String roomType, int numberOfDays, float roomPrice, float foodCharges) {
		this.roomType = roomType;
		this.numberOfDays = numberOfDays;
		this.roomPrice = roomPrice;
		this.foodCharges = foodCharges;
	}

	void showDetails() {
		float totalRoomRent = roomPrice * numberOfDays;
		float finalBill = totalRoomRent + foodCharges;

		System.out.println("Room Type : " + roomType);
		System.out.println("Number Of Days Stay : " + numberOfDays);
		System.out.println("Room Price per Day : " + roomPrice);
		System.out.println("Food Charges : " + foodCharges);
		System.out.println("\nTotal Room Rent for " + numberOfDays + " days is : " + totalRoomRent);
		System.out.println("Your Final Bill With Food Charges : " + finalBill);
	}

	public static void main(String[] args) {
		System.out.println("************** Enter the Hotel Room Details ***************\n");
		HotelBill h1 = new HotelBill();
		System.out.println("****************** => Hotel Bill <= *******************");
		h1.showDetails();
		System.out.println("\n*********************=>Thank you Don't Come Again<=***************");
		
		sc.close();
	}
}
