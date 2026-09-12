package if_Else_LangFund;

import java.util.Scanner;

public class EligibleToVote {
	void eligible(int age) {
		if (age >= 18) {
			System.out.println("Are You a Auntyyy => 😂😂😂😂");
			System.out.println("Congrats !! You are Eligible !! ❤️❤️");
		} else {
			System.out.println("Babu niku inka time vundi amma !! Gudha Bachha ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EligibleToVote obj = new EligibleToVote();
		System.out.println("********** Eligibility ***********");
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		obj.eligible(age);
		sc.close();
	}
}
