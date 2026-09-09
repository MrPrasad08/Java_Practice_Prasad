package methods_Day11;

import java.util.Scanner;

public class Number_Checking {
	boolean isEven(int n) {
		boolean result = (n % 2) == 0 ? true : false;
		return result;
	}

	boolean isOdd(int n) {
		boolean result = (n % 2 != 0) ? false : true;
		return result;
	}

	void threeNumBig(int a, int b, int c, int d) {
		int result = a > b ? (a > c ? (a > d ? a : d) : (c > d ? c : d)) : (b > c ? (b > d ? b : d) : (c > d ? c : d));
		System.out.println(+result + " is big");
	}

	boolean isPositive(int num) {
		boolean positive = false;
		if (num >= 0) {
			positive = true;
		}
		return positive;
	}

	boolean isNegative(int num) {
		boolean negative = false;
		if (num < 0) {
			negative = true;
		}
		return negative;
	}

	boolean isZero(int num) {
		boolean zero = false;
		if (num == 0) {
			zero = true;
		}
		return zero;
	}

	boolean isPrime(int num) {
		boolean prime = false;
		int count = 0;
		for (int i = 1; i < Math.sqrt(num); i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 1) {
			prime = true;
		}
		return prime;
	}

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		Number_Checking obj = new Number_Checking();
		System.out.println("***************************************");
		boolean even = obj.isEven(4);
		System.out.println("IS EVEN : " + even);

		boolean odd = obj.isOdd(11);
		System.out.println("IS ODD : " + odd);

		obj.threeNumBig(64, 76, 17, 42);
		boolean positive = obj.isPositive(42);
		System.out.println("Positive : " + positive);

		boolean negative = obj.isNegative(-143);
		System.out.println("Negative : " + negative);

		boolean prime = obj.isPrime(14);
		System.out.println("Prime : " + prime);

		boolean zero = obj.isZero(0);
		System.out.println("Zero : " + zero);
	}
}
