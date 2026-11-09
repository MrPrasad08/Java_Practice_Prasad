package switchCases_LangFund;

import java.util.Scanner;

public class FoodOrderingSystem {

	static void display(int option, int quantity, double totalBill) {
		System.out.println("\n***** Your Selected Item **********");
		if (option == 1) {
			System.out.println("Your Item : Pizza");
		} else if (option == 2) {
			System.out.println("Your Item : Burger");
		} else if (option == 3) {
			System.out.println("Your Item : Biryani");
		} else if (option == 4) {
			System.out.println("Your Item : Noodel's");
		}
		System.out.println("Your qunatity : " + quantity);
		System.out.println("Total Bill : " + totalBill);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("************ Welcome to Food Ordering System ************\n");
		System.out.println("Available Items------------------");

		int quantity = 0;
		double totalBill = 0;

		System.out.println("1.Pizza -> ₹200 \n2.Burger -> ₹120 \n3.Biryani -> ₹180 \n4.Noodles -> ₹100");
		System.out.println("Enter option what do you want !!");
		int option = sc.nextInt();

		switch (option) {
		case 1 -> {
			System.out.println("******** Pizza's *********");
			System.out.println("How many pizza's you want => : ");
			quantity = sc.nextInt();
			totalBill += 200 * quantity;
			System.out.println("Your order confirmed....... !! just 10 min ");
		}
		case 2 -> {
			System.out.println("******** Burger's *********");
			System.out.println("How many burgers you want : ");
			quantity = sc.nextInt();
			totalBill += 120 * quantity;
			System.out.println("Your order confirmed....... !! just 10 min ");
		}
		case 3 -> {
			System.out.println("******** Birayni's *********");
			System.out.println("How many biryani's you want : ");
			quantity = sc.nextInt();
			totalBill += 180 * quantity;
			System.out.println("Your order confirmed....... !! just 10 min ");
		}
		case 4 -> {
			System.out.println("******** Noodle's *********");
			System.out.println("How many noodel's you want : ");
			quantity = sc.nextInt();
			totalBill += 100 * quantity;
			System.out.println("Your order confirmed....... !! just 10 min ");
		}
		default -> {
			System.out.println("Item Not available please enter valid option.........");

		}
		}

		display(option, quantity, totalBill);
		sc.close();

	}
}
