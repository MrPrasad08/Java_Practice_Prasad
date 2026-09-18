package nested_If_Lang_Fund;

import java.util.Scanner;

public class Marriage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("******************* Welcome to Pellila Matrimony !! ************************\n");
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		System.out.println("Enter your asserts : ");
		double asserts = sc.nextDouble();
		System.out.println("Enter your salary : ");
		double salary = sc.nextInt();

		if (asserts >= 50000000 && salary >= 2500000) {
			System.out.println("All good let's continue the discussion !!");
			System.out.println("Enter your age : ");
			int age = sc.nextInt();
			if (age >= 26 && age <= 29) {
				System.out.println("Okay let's continue the discussion !!");

				System.out.println("Enter your weight : ");
				double weight = sc.nextDouble();
				if (weight >= 65 && weight <= 78) {
					System.out.println("Wieght kuda set uuu !!");

					System.out.println("Enter your height : ");
					double height = sc.nextDouble();
					if (height >= 5.7 && height <= 6.2) {
						System.out.println("You are awesome guyy !!");
						sc.nextLine();
						System.out.println("Do you have any siblings : ");
						String status = sc.nextLine();
						if (status.equalsIgnoreCase("yes")) {
							System.out.println("OMG Ohhh !! We will call you later.............");
						} else {
							System.out.println("Pellikii maku okay.......... Marriage Set uuuu !!");
						}
					} else {
						System.out.println("Babuu miru chala short or long gaa vunnaru");
					}
				} else {
					System.out.println("Mii weight chala thakkuvaa or ekkuva vundi!!");
					System.out.println("Gym  kii vellandi !! Poyi fittness mida concentrate cheyyu...........");
				}
			} else {
				System.out.println("Sorry babu !! You are to young or to old");
			}
		} else {
			System.out.println("Your salary or your asserts are low !!! ");
			System.out.println("Good byee !! ");
			System.out.println("Concentrate on your career !!");
		}
		sc.close();
	}
}
