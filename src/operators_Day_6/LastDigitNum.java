package operators_Day_6;

import java.util.Scanner;

class Number {
	Integer num;

	Number(Integer num) {
		this.num = num;
	}

	int lastDigit() {
		if (num <= 0)
			return num;
		int ele = num % 10;
		return ele;
	}
}

public class LastDigitNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		Integer n = sc.nextInt();
		Number obj = new Number(n);
		System.out.println("Last Digit : " + obj.lastDigit());
		sc.close();
	}
}
