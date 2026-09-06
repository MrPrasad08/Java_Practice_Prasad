package com.languageFund_CONSTRUCTORS;

public class Car {
	String brand;
	int model;
	double price;

	Car() {
		System.out.println("*********No-args Constructor****************");
		brand = "Defender";
		model = 1995;
		price = 20000000;
		this.showInfo();
	}

	Car(String brand, int model, double price) {
		System.out.println("**********Parametarized Constructor*************");
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.showInfo();
	}

	void showInfo() {
		System.out.println("Brand : " + brand);
		System.out.println("Model : " + model);
		System.out.println("Price : " + price);
	}

	public static void main(String[] args) {
		new Car();
		new Car("Range Rover", 2026, 10500000);
		new Car();
	}
}
