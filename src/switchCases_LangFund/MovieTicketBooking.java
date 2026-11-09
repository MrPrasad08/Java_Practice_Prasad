package switchCases_LangFund;

import java.util.Scanner;

public class MovieTicketBooking {

	static Scanner sc = new Scanner(System.in);

	static float ticketPrice() {
		System.out.println("Select Ticket Type : \n1.Balcony => 150 \n2.Sofa => 250 \n3.Bench => 100");
		int type = sc.nextInt();
		System.out.println("Enter how many tickets : ");
		int count = sc.nextInt();
		float amount = 0;
		if (type == 1) {
			amount = count * 150;
		} else if (type == 2) {
			amount = count * 250;
		} else if (type == 3) {
			amount = count * 100;
		}
		return amount;
	}

	public static void main(String[] args) {

		System.out.println("\n************ Movie Ticket Booking ****************");
		System.out.println("Movies Playing : \n");
		System.out.println("1.Kakli \n2.Salaar \n3.Irumudi \n4.V&S \n5.Spider-Man \n6.Toxic");
		String msg = "";
		float amount = 0;

		do {
			System.out.println("\nEnter the option : ");
			int option = sc.nextInt();
			if (option < 0) {
				System.out.println("Enter valid option between 1 - 6 :");
			} else {
				switch (option) {

				case 1: {
					System.out.println("\n*******************KALKI MOVIE *********************");
					amount += ticketPrice();
					break;
				}
				case 2: {
					System.out.println("\n*******************SALAAR MOVIE *********************");
					amount += ticketPrice();
					break;
				}
				case 3: {
					System.out.println("\n*******************IRUMUDI MOVIE *********************");
					amount += ticketPrice();
					break;
				}
				case 4: {
					System.out.println("\n*******************V & S MOVIE *********************");
					amount += ticketPrice();
					break;
				}
				case 5: {
					System.out.println("\n*******************SPIDER - MAN MOVIE *********************");
					amount += ticketPrice();
					break;
				}
				case 6: {
					System.out.println("\n*******************TOXIC MOVIE *********************");
					amount += ticketPrice();
					break;
				}
				default: {
					System.out.println("Enter valid option..........");
					break;
				}
				}
			}
			System.out.println("Do you want to select another movie (y/n) !!");
			msg = sc.next();
		} while (msg.equalsIgnoreCase("y"));
		System.out.println("\n**************** Total Price **************");
		System.out.println("Total Price : " + amount);

	}
}
