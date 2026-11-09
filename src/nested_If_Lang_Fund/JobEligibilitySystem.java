package nested_If_Lang_Fund;

import java.util.Scanner;

public class JobEligibilitySystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*********** Job Eligibility Creteria **************\n");
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		if (age >= 21) {
			System.out.println("Niku Job ki age eligibility vundii.......");

			System.out.println("Enter your qualification : ");
			String education = sc.nextLine();
			if (education.equalsIgnoreCase("Btech") || education.equalsIgnoreCase("degree")
					|| education.equalsIgnoreCase("mca") || education.equalsIgnoreCase("pg")) {

				System.out.println("Qualification is eligible...........");
				System.out.println("Enter your " + education.toUpperCase() + " percentage : ");
				float percentage = sc.nextFloat();

				if (percentage >= 75 && percentage < 100) {
					System.out.println("Good " + percentage + " !!");

					System.out.println("Enter your experience in years : ");
					int exp = sc.nextInt();
					if (exp >= 2 && exp <= 5) {
						System.out.println("Okayy good !!!");

						System.out.println("You have any knowledge about JAVA : ");
						boolean java = sc.nextBoolean();
						if (java) {
							System.out.println("Okayy !! Then what about your SQL knowledge... : ");
							boolean sql = sc.nextBoolean();
							if (sql) {
								System.out.println("All goood !!");
								System.out.println("Your qualifications all set for our requirements !!");
							} else {
								System.out.println("We want the SQL knowledged persons !!");
							}
						} else {
							System.out.println("We want the java knowledged persons !!");
						}
					} else {
						System.out.println("Your experience is too loww !!");
					}
				} else {
					System.out.println("Your percentage " + percentage + " not sutible for our requirements !!");
				}
			} else {
				System.out.println("Niku inka chaduvu vundi kada ra.......");
			}
		} else {
			System.out.println("Niku inka age time vundi kada raa.....");
		}
	}
}
