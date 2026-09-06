package com.languageFund_CONSTRUCTORS;

public class Constructor1 {
	Constructor1() {
		System.out.println("\nNo - args Constructor !!");
	}
	
	Constructor1(String name){
		System.out.println("1-args Constructor !!");
		System.out.println("Name : "+name);
	}
	public static void main(String[] args) {
		System.out.println("Main method started !!!!");
		System.out.println("**************************************");
		new Constructor1();
		new Constructor1("Mr-Prasad");
	}
}
