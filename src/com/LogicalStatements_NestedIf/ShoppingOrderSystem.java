package com.LogicalStatements_NestedIf;

import java.util.Scanner;

public class ShoppingOrderSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*********** Online Shopping Order System ********************************\n");
		System.out.println("Please Tell me your name : ");
		String name = sc.nextLine();
		System.out.println("Enter your product name : ");
		String proName = sc.nextLine();

		if (proName.equals("Badamgiri") || proName.equals("DairyMilk") || proName.equals("Biryani")
				|| proName.equals("Chicken") || proName.equals("Laddu") || proName.equals("junnu")
				|| proName.equals("chocolates")) {
			System.out.println("Your product is Available");

			System.out.println("Enter your price : ");
			float price = sc.nextFloat();

			if (price >= 10 && price <= 1000) {

				System.out.println("Yess Price is valid !!");
				System.out.println("Enter quantity what you want : ");
				int quantity = sc.nextInt();

				if (quantity >= 1 && quantity <= 20) {

					System.out.println("Your quantity is valid !! Available........");
					System.out.println("Ok Is you confirm your orders !!..........");
					boolean status = sc.nextBoolean();

					if (status) {

						System.out.println("Thank youu for confirming your order.............");
						double bill = price * quantity;
						System.out.println("Your total Bill : " + bill);

						System.out.println("Please give your money : ");
						double money = sc.nextDouble();

						if (money < bill) {

							System.out.println("Areyy pappa gaa bill entha ayyindi nv entha isthunnav !!......");

						} else if (money > 10000) {
							System.out.println("Sorry babu memu antha chnage ivvalem miru anthe rich anii.....");
						} else {
							float change = (float) (money - bill);
							System.out.println("Your change : " + change);
							System.out.println("Thank youu !! Please malli rakandii.............");
						}
					} else {
						System.out.println(
								"Marii enduku raa niku time waste gadivi bokka raa niku anni !!!..................");
					}
				} else {
					System.out.println(
							"Adii kadupaa inka emaina antha quantity em chesikuntavu raa 🤦‍♂️🤦‍♂️🤦‍♂️🤦‍♂️🤦‍♂️ !...........");
				}
			} else {
				System.out.println("babu miru rich emo maa daggara antha valueble items levuu !!");
			}

		} else {
			System.out.println("Babuu maa daggara ahh items levu amma !! pakkaki velli aaduko");
		}
		sc.close();
	}
}
