package com.languageFund_CONSTRUCTORS;

public class Car_ConstructorChain {
	String model;
	String brand;
	long price;
	int year;
	String color;

	Car_ConstructorChain() {
		System.out.println("*********No-Arg Constructor***********\n");
		this("Baleno");
	}

	Car_ConstructorChain(String model) {
		System.out.println("*********1-Arg Constructor***********\n");
		this("Baleno", "Suzuki");
	}

	Car_ConstructorChain(String model, String brand) {
		System.out.println("*********2-Arg Constructor***********\n");
		this("Baleno", "Suzuki", 120000);
	}

	Car_ConstructorChain(String model, String brand, long price) {
		System.out.println("*********3-Arg Constructor***********\n");
		this("Baleno", "Suzuki", 120000, 2025);
	}

	Car_ConstructorChain(String model, String brand, long price, int year) {
		System.out.println("*********4-Arg Constructor***********\n");
		this("Baleno", "Suzuki", 100000, 2024, "Red");
		
	}

	Car_ConstructorChain(String model, String brand, long price, int year, String color) {
		System.out.println("*********5-Arg Constructor***********\n");
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.year = year;
		this.color = color;
		showInfo();
	}

	void showInfo() {
		System.out.println("Car Model : " + model);
		System.out.println("Car Brand : " + brand);
		System.out.println("Car Price : " + price);
		System.out.println("Car Year  : " + year);
		System.out.println("Car Color : " + color);
	}

	public static void main(String[] args) {
		new Car_ConstructorChain();
	}
}
