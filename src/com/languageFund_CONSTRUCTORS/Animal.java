package com.languageFund_CONSTRUCTORS;

public class Animal {
	String breed;
	int age;
	String color;

	Animal() {
		System.out.println("Animal Constructor !!!");
	}

	public static void main(String[] args) {
		System.out.println("Animal class");
	}
}

class Cat extends Animal {
	void msg() {
		breed = "Roman";
		System.out.println("Breed : "+super.breed);
	}

	public static void main(String[] args) {
		System.out.println("Cat Class !!!");
		Cat obj = new Cat();
		obj.msg();
	}

}
