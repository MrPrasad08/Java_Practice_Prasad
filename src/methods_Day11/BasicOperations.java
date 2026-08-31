package methods_Day11;

import java.util.Scanner;

public class BasicOperations {

	// with return type + no parameter
//================================================

	Scanner sc = new Scanner(System.in);

	int addTwoNum() {
		System.out.println("*****************Addition*****************");
		System.out.println("Enter two number :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a + b;
		return sum;
	}

	Integer subTwoNum() {
		System.out.println("******************Subtraction******************");
		System.out.println("Enter two number :");
		Integer a = sc.nextInt();
		Integer b = sc.nextInt();
		Integer sub = a - b;
		return sub;
	}

	Float mulTwoNum() {
		System.out.println("******************Multiplication*****************");
		System.out.println("Enter any two numbers : ");
		float a = sc.nextFloat();
		int b = sc.nextInt();
		return a * b;
	}

	Float divTwoNum() {
		System.out.println("*******************Division***********************");
		System.out.println("Enter any two number : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		float div = a / b;
		return div;
	}

	double findRemainder() {
		System.out.println("*******************Remainder*******************");
		System.out.println("Enter any two numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		return a % b;
	}

	float findSquare() {
		System.out.println("*******************Square***********************");
		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		return num * num;
	}

	double findCube() {
		System.out.println("********************Cube*********************");
		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		return num * num * num;
	}

	double findPow() {
		System.out.println("*********************Power***********************");
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		System.out.println("Enter power number : ");
		int pow = sc.nextInt();

		int count = 1;
		int res = 1;
		while (count <= pow) {
			res = n * res;
			count++;
		}
		return res;
	}

	double findSquareRoot() {
		System.out.println("*****************Square Root**********************");

		System.out.println("Enter a number for finding the square root : ");
		int num = sc.nextInt();
		float sqrt = (float) Math.sqrt(num);
		return sqrt;
	}

	int findAbsValue() {
		System.out.println("********************Absolute Value******************");
		System.out.println("Enter the number : ");
		double num = sc.nextDouble();
		int round = (int) Math.abs(num);
		return round;
	}

	void main(String[] args) {

		int sum = addTwoNum();
		System.out.println("Sum : " + sum);

		int sub = subTwoNum();
		System.out.println("Subtraction : " + sub);

		float mul = mulTwoNum();
		System.out.println("Multiplication : " + mul);

		float div = divTwoNum();
		System.out.println("Division : " + div);

		float rem = (float) findRemainder();
		System.out.println("Remainder is : " + rem);

		double square = findSquare();
		System.out.println("Squre : " + square);

		double cube = findCube();
		System.out.println("Cube : " + cube);

		int pow = (int) findPow();
		System.out.println("Power : " + pow);

		int sqrt = (int) findSquareRoot();
		System.out.println("Square Root : " + sqrt);

		int abs = findAbsValue();
		System.out.println("Absolute Value : " + abs);
	}
}
