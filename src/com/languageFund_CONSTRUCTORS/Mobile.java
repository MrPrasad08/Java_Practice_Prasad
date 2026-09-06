package com.languageFund_CONSTRUCTORS;

public class Mobile {
	String brand;
	String model;
	float price;
	int ram;

	// No - args Constructor
	Mobile() {
		this("Real-Me");// 1 arg constructor called
	}

	Mobile(String brand) {
		this(brand, "C-53"); // 2-arg Constructor called
	}

	Mobile(String brand, String model) {
		this(brand, model, 29000);// 3-args Constructor Called
	}

	Mobile(String brand, String model, float price) {
		this(brand, model, price, 8);// 4-arg Constructor called
	}

	Mobile(String brand, String model, float price, int ram) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.ram = ram;
		// values assigned to the class level variables
		showInfo();//info method called
	}
	
	void showInfo() {
		System.out.println("Brand : "+brand);
		System.out.println("Model : "+model);
		System.out.println("Price : "+price);
		System.out.println("Ram : "+brand);
	}
	public static void main(String[] args) {
		System.out.println("********Main Method Started************");
		new Mobile(); // no arg constructor called
	}

}
