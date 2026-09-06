package com.languageFundamentals;

public class MainMethods {
	void main() {
		System.out.println("Main 1");
	}
	public static void main(String[] args) {
		 System.out.println("main method called");
		MainMethods obj = new MainMethods();
		obj.main();
	}
}
