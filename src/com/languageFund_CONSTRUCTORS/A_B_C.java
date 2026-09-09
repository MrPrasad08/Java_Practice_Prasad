package com.languageFund_CONSTRUCTORS;

public class A_B_C {
	static {
		System.out.println("!! Static block from the A_B_C class !!");
	}

	{
		System.out.println("!! Instance block from the A_B_C class !! ");
	}

	A_B_C() {
		System.out.println("!! Default Constructor from A_B_C class !!");
	}
	
	void main() {
		
	}

}

class B extends A_B_C {
	static {
		System.out.println("!! Static block from the B class !!");
	}

	{
		System.out.println("!! Instance block from the B class !! ");
	}

	B() {
		System.out.println("!! Default Constructor from B class !!");
	}

}

class C extends B {
	static {
		System.out.println("!! Static block from the C class !!");
	}

	{
		System.out.println("!! Instance block from the C class !! ");
	}

	C() {
		System.out.println("!! Default Constructor from C class !!");
	}

}

class Info {
	public static void main(String[] args) {
		new A_B_C();
		System.out.println();
		new B();
		System.out.println();
		new C();
	}
}