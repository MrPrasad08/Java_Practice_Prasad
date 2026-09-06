package com.languageFund_CONSTRUCTORS;

public class BikeConstructor {
	String model;
	String brand;
	long price;
	int year;
	String color;
	float maileage;

	BikeConstructor() {
		System.out.println("*****************Bike Constructor**************\n");
	}

	BikeConstructor(String model) {
		System.out.println("---------- => 1-args Constructor <= -------------");
		this.model = model;
		showInfo();
	}

	BikeConstructor(String model, String brand) {
		System.out.println("---------- => 2-args Constructor <= -------------");
		this.model = model;
		this.brand = brand;
		showInfo();
	}

	BikeConstructor(String model, String brand, long price) {
		System.out.println("---------- => 3-args Constructor <= -------------");
		this.model = model;
		this.brand = brand;
		this.price = price;
		showInfo();
	}

	BikeConstructor(String model, String brand, long price, int year) {
		System.out.println("---------- => 4-args Constructor <= -------------");
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.year = year;
		showInfo();
	}

	BikeConstructor(String model, String brand, long price, int year, String color) {
		System.out.println("---------- => 5-args Constructor <= -------------");
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.year = year;
		this.color = color;
		showInfo();
	}

	void showInfo() {
		System.out.println("Bike Model : " + model);
		System.out.println("Bike Brand : " + brand);
		System.out.println("Bike price : " + price);
		System.out.println("Bike Year : " + year);
		System.out.println("Bike Color : " + color);
		System.out.println("Bike maileage : " + maileage);
		System.out.println("***************************************\n");
	}

	public static void main(String[] args) {
		BikeConstructor obj = new BikeConstructor();
		obj.showInfo();
		 new BikeConstructor("Pulsar");
	     new BikeConstructor("FZ-S", "Yamaha");
	     new BikeConstructor("Classic-350", "Royal Enfield", 400000, 2025, "Black");
	}
}
