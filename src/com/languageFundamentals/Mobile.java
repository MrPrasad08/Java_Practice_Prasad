package com.languageFundamentals;

public class Mobile {
	static String brand;
	String model;
	double price;
	String ram;
	
	static {
		System.out.println("Mobile Store Phone Details");
	}
	{
		System.out.println("\n************************************");
	}
	static void company() {
		System.out.println("Our Company " +brand+ "\n");
	}
	void display() {
		System.out.println("Brand : " + brand);
		System.out.println("Model : " + model);
		System.out.println("Price : " + price);
		System.out.println("Ram : " + ram);
	}

	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		brand = "Iphone";
		m1.model = "Iphone 13";
		m1.price = 69999;
		m1.ram = "8GB";
		company();
		m1.display();
		
		Mobile m2 = new Mobile();
		brand = "Oppo";
		m2.model = "Oppe Reno 17";
		m2.price = 35999;
		m2.ram = "8GB";
		company();
		m2.display();
	}
}
