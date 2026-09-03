package com.languageFundamentals;

public class TestDemoOne {
	void results(int a, int b) {
		addition(a, b);
		subtraction(a, b);
	}

	void addition(int a, int b) {
		System.out.println("Adddition : " + (a + b));
	}

	void subtraction(int a, int b) {
		System.out.println("Subtraction is : " + (a - b));
	}

	void multiplication(int a, int b) {

	}

	public static void main(String[] args) {
		TestDemoOne obj = new TestDemoOne();
		obj.results(2, 4);
	}
}
