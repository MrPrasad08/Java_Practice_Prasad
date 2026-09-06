package com.languageFund_CONSTRUCTORS;

public class Product {
	int id;
	String name;
	float price;

	Product(int id, String name, float Price) {
		this.id = id;
		this.name = name;
		this.price = Price;
		showInfo();
		this.msg();
	}

	void msg() {
		System.out.println("Message Method !!");
	}

	void showInfo() {
		System.out.println("ID of the Product : " + id);
		System.out.println("Name of the Product : " + name);
		System.out.println("Price of the produc : " + price);
	}

	public static void main(String[] args) {
		new Product(101, "IPhone-15", 790000);
	}
}
