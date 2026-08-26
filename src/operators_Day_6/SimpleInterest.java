package operators_Day_6;

import java.util.Scanner;

class details {
	long amount;
	float time;
	float interest;
	float SI;

	details(long amount, float time, float interest) {
		this.amount = amount;
		this.time = time;
		this.interest = interest;
	}

	void display() {
		System.out.println("Your amount : " + amount);
		System.out.println("Time Duration : " + time);
		System.out.println("Rate of Interest : " + interest);
	}

	float interest() {
		SI = (amount * time * interest) / 100;
		float monthWise = SI / time;
		System.out.println("Per Month you will pay : " + monthWise);
		System.out.println("Simple Interest of your money for " + time + " months/years : " + SI);
		return SI;
	}
}

public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount you want :");
		long amount = sc.nextInt();
		System.out.println("How much time you want : ");
		float time = sc.nextFloat();
		System.out.println("How much of interest you will give : ");
		float interest = sc.nextFloat();

		details obj = new details(amount, time, interest);

		obj.display();
		obj.interest();
	}
}
