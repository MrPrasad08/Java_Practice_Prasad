package caseStudies;

import java.util.Scanner;

public class OnlineHspAppBookingSys {

	static Scanner sc = new Scanner(System.in);
	static int age;
	static int patientType;
	static int appointmentAvailability;

	static boolean ageValid(int age) {
		boolean status = false;
		if (age < 0) {
			status = false;
		} else if (age >= 18) {
			status = true;
		}
		return status;
	}

	static void patient(int type) {

		if (type == 1) {
			System.out.println("Your are a Regular type Patient....");

			System.out.println("Appointment is available or not -> Available(1) / Not Available(2) : ");
			appointmentAvailability = sc.nextInt();

			if (appointmentAvailability == 1) {
				System.out.println("Regular Appointment Confirmed....!!");
			} else if (appointmentAvailability == 2) {
				System.out.println("Appointment not available please book another Slot.....");
			} else {
				System.out.println("Enter valid appointment type darling....");
			}

		} else if (type == 2) {
			System.out.println("Emergency Partient......");

			System.out.println("Emergency Appointment available or not -> Available(1) / Not Available(2) : ");
			appointmentAvailability = sc.nextInt();

			if (appointmentAvailability == 1) {
				System.out.println("Emergemcy Slot is Available... Confirmed !!");
			} else if (appointmentAvailability == 2) {
				System.out.println("Emergemcy Slot is Not Available...");
			} else {
				System.out.println("Invalid Emergency Slot.. !!");
			}
		} else {
			System.out.println("Enter valid type darling !!...");
		}
	}

	static void displayDetails() {
		System.out.println();
		System.out.println("Patient Age : " + age);
		if (patientType == 1) {
			System.out.println("Patient Type : Regular....");

			if (appointmentAvailability == 1) {
				System.out.println("Appointment Availability : Appointment cofirmed for Regular Patient...");
			} else if (appointmentAvailability == 2) {
				System.out.println("Appointment Availability : Appointment Not Available... Book another slot");
			}

		} else if (patientType == 2) {
			System.out.println("Patient Type : Emergency....");

			if (appointmentAvailability == 1) {
				System.out.println("Appointment Availability : Emergency Slot booked..!!");
			} else if (appointmentAvailability == 2) {
				System.out.println("Appointment Availability : Emergency slot not available... !!");
			}
		}

	}

	public static void main(String[] args) {

		System.out.println("\n*********************************************");
		System.out.println("\n************ Welcome to Online Hospital Appointment Booking System **************");
		System.out.println("Enter your age : ");
		age = sc.nextInt();
		boolean status = ageValid(age);
		
		if (status) {
			System.out.println("Which type you are Regular / Emergency (1/2) : ");
			patientType = sc.nextInt();
			patient(patientType);
		} else {
			System.out.println("Enter a valid age....");
		}

		displayDetails();
	}
}
