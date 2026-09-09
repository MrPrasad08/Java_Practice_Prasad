package com.languageFund_CONSTRUCTORS;

import java.util.Scanner;

public class MobileBill {

	String brand;
	String mobileName;
	float price;
	int quantity;
	float deliveryCharges;
	static Scanner sc = new Scanner(System.in);

	MobileBill() {
		System.out.println("Enter your mobile brand : ");
		String brand = sc.nextLine();
		this(brand);
	}

	MobileBill(String brand) {
		System.out.println("Enter the mobile name : ");
		String mobileName = sc.nextLine();
		this(brand, mobileName);
	}

	MobileBill(String brand, String mobileName) {
		System.out.println("Enter the price of the mobile : ");
		float price = sc.nextFloat();
		this(brand, mobileName, price);
	}

	MobileBill(String brand, String mobileName, float price) {
		System.out.println("Enter the Quantity of the mobiles : ");
		int quantity = sc.nextInt();
		this(brand, mobileName, price, quantity);
	}

	MobileBill(String brand, String mobileName, float price, int quantity) {
		System.out.println("Enter delivery charges per kilometer : ");
		float deliveryCharges = sc.nextFloat();
		this(brand, mobileName, price, quantity, deliveryCharges);
	}

	MobileBill(String brand, String mobileName, float price, int quantity, float deliveryCharges) {
		this.brand = brand;
		this.mobileName = mobileName;
		this.price = price;
		this.quantity = quantity;
		this.deliveryCharges = deliveryCharges;
	}

	void mobileBillDetails() {
		float mobileCost = price * quantity;
		float finalBill = mobileCost + deliveryCharges;

		System.out.println("Your Phone Brand : " + brand);
		System.out.println("Your Phone Name  : " + mobileName);
		System.out.println("Your Phone Price : " + price);
		System.out.println("Mobiles Quantity : " + quantity);
		System.out.println("Delivery Charges : " + deliveryCharges);
		System.out.println();
		System.out.println("Mobile Cost : " + mobileCost);
		System.out.println("Final Bill : " + finalBill);
	}

	public static void main(String[] args) {
		System.out.println("************** Enter your mobile details : ***************");

		MobileBill m1 = new MobileBill();
		System.out.println("*********** => Mobile Bill <= *******************");
		m1.mobileBillDetails();

		sc.close();
	}
}
