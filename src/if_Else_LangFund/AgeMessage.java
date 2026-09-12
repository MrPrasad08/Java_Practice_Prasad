package if_Else_LangFund;

import java.util.Scanner;

public class AgeMessage {

	String result(int age) {
		String msg = "";

		if (age > 100 || age < 0) {
			msg = "Please Enter valid Age";
		} else if (age > 0 && age <= 5) {
			msg = "You are a KID !! Cutie";
		} else if (age > 5 && age <= 12) {
			msg = "You are a Children !!";
		} else if (age > 12 && age <= 19) {
			msg = "You are a Teen Age Person";
		} else if (age > 19 && age <= 35) {
			msg = "Ewyuu You are Younger !! Be ready MG your life !!";
		} else if (age > 35 && age <= 60) {
			msg = "Old Aged Person !!";
		} else {
			System.out.println("Grand Old Aged Person !!");
		}
		return msg;
	}

	public static void main(String[] args) {
		System.out.println("********** Age Message ***************");

		Scanner sc = new Scanner(System.in);
		AgeMessage obj = new AgeMessage();

		System.out.println("Enter your age : ");
		int age = sc.nextInt();

		String msg = obj.result(age);
		System.out.println(msg);
		sc.close();
	}
}
