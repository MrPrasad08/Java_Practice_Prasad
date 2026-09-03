package com.languageFundamentals;

public class TestDemo1 {
	static int x = 10;
	int y = 20;
	static {
		x += 5;
	}
	
	{
		y += x;
	}
	
	 void show(int a, double b) {
		System.out.println("Show");
	}
	 
	 void msg(int a) {
		 System.out.println("int");
	 }
	 void msg(long a) {
		 System.out.println("long");
	 }
	 void msg(double a) {
		 System.out.println("double");
	 }
	 void show(double a, int b) {
		System.out.println("Show");
	}
	public static void main(String[] args) {
		TestDemo1 a = new TestDemo1();
		a.y+=x;
		TestDemo1 b = new TestDemo1();
		System.out.println(x+" "+a.y+" "+b.y);
		
		a.msg(10);
	}
}
