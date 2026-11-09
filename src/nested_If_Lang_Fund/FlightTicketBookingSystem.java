package nested_If_Lang_Fund;

import java.util.Arrays;
import java.util.Scanner;

public class FlightTicketBookingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("************* Flight Ticket Booking System ******************\n");

		System.out.println("Enter the Passenger Name : ");
		String name = sc.nextLine();
		System.out.println("Enter the age : ");
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("Ewyuuuuuuu !!!");
			System.out.println("You are Eligible For the Ticket...............");

			sc.nextLine();

			System.out.println("Enter your source : ");
			String source = sc.nextLine();
			System.out.println("Enter your destination : ");
			String destination = sc.nextLine();

			System.out.println("Enter Number of tickets : ");
			int tickets = sc.nextInt();
			sc.nextLine();

			if (tickets <= 10 && tickets > 0) {
				System.out.println("Tickets are Available : ");
				System.out.println("Seats Available are : A1, A2, A3, F1, F2, F3, F4, F5, F6");
				int count = 0;
				boolean correct = false;
				String arr[] = new String[tickets];
				System.out.println("Select Your Seats : ");

				while (count < tickets) {
					String seat = sc.nextLine();

					if (seat.equalsIgnoreCase("a1") || seat.equalsIgnoreCase("a2") || seat.equalsIgnoreCase("a3")
							|| seat.equalsIgnoreCase("f1") || seat.equalsIgnoreCase("f2") || seat.equalsIgnoreCase("f3")
							|| seat.equalsIgnoreCase("f4") || seat.equalsIgnoreCase("f5")
							|| seat.equalsIgnoreCase("f6")) {

						correct = true;
						arr[count] = seat;
						count++;
					} else {
						correct = false;
						return;
					}
				}
				if (correct) {
					System.out.println("Seats Are Selected : " + (Arrays.toString(arr)));

					double amount = 1250.55;
					System.out.println("Each Ticket Price is : " + amount);
					double totalAmount = (amount * tickets);
					System.out.println("Total " + tickets + " amount is : " + totalAmount);

					System.out.println("Enter your amount : ");
					double yourMoney = sc.nextDouble();

					if (yourMoney >= totalAmount) {
						double dueBalance = yourMoney - totalAmount;
						System.out.println("Ewyuuu........");
						System.out.println("Booking Successfull !! Darling........\n");
						System.out.println("Name : " + name);
						System.out.println("Age : " + age);
						System.out.println("To => " + destination + "\nFrom => " + source);
						System.out.println(tickets + " Seats Selected......");
						System.out.println("\nYour Remaining Balance is : " + dueBalance);
					} else {
						System.out.println(
								"dabbulu lekunda tickets select chesav entra intha talented gaa vunnav........");
					}
				} else {
					System.out.println("Seats akkada vunanvi select chesikoraa !! niku nachhinavii kaadu............");
				}
			} else {
				System.out.println("Maa daggara anni seats levuu amma !!");
			}

		} else {
			System.out.println("Babuuu Niku inka time vundi raa !! pakkakii velli adukoo.........");
		}
		sc.close();
	}
}
