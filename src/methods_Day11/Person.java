package methods_Day11;

import java.util.Scanner;

public class Person {
	// no return type + no parameters
	// one
	void Greetings(String name) {
		System.out.println("Hii !! ❤️ Welcome Mr/Ms => " + name);
	}

	// two
	void getName(String name) {
		System.out.println("Name : " + name);
	}

	// 3
	void getAge(int age) {
		System.out.println("Your age : " + age);
	}

	// 4
	void getGender(String gender) {
		System.out.println("Your Gender : " + gender);
	}

	// 5
	void getPhone(long phone) {
		System.out.println("Mobile : " + phone);
	}

	// 6
	void getAadhaar(Long aadhaar) {
		System.out.println("Aadhaar Number : " + aadhaar);
	}

	// 7
	void getPan(String pan) {
		System.out.println("PAN Number : " + pan);
	}

	// 8
	void getNationality(String nation) {
		System.out.println("Your Nationality : " + nation);
	}

	// 9
	void getAddress(String address) {
		System.out.println("Your Address : " + address);
	}

	// 10
	void getOccupation(String occ) {
		System.out.println("Your Occupation : " + occ);
	}

	// 11
	void getSpeakLanguages(String languages) {
		System.out.println("Your Spoken Languages : " + languages);
	}

	// 12
	void getReligion(String religion) {
		System.out.println("Your Religion : " + religion);
	}

	// 13
	void getWeight(Float weight) {
		System.out.println("Your Weight : " + weight);
	}

	// 14
	void getHeight(Float height) {
		System.out.println("Your Height : " + height);
	}

	// 15
	void getMarriedStatus(boolean status) {
		System.out.println("Your Married Status : " + status);
	}

	public static void main(String[] args) {

		Person p1 = new Person();

		Scanner sc = new Scanner(System.in);
		System.out.println("******************// Enter Your Details //***********************\n");
		System.out.println("Enter your name :");
		String name = sc.nextLine();

		System.out.println("Enter your age :");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter your gender :");
		String gender = sc.nextLine();

		System.out.println("Enter your phone number :");
		long phone = sc.nextLong();

		System.out.println("Enter your Aadhaar Number :");
		Long aadhaar = sc.nextLong();
		sc.nextLine();

		System.out.println("Enter your PAN number :");
		String pan = sc.nextLine();

		System.out.println("Enter your nationality :");
		String nation = sc.nextLine();

		System.out.println("Enter your Address : ");
		String address = sc.nextLine();

		System.out.println("Enter your Occupation : ");
		String occ = sc.nextLine();

		System.out.println("Enter your Languages : ");
		String languages = sc.nextLine();

		System.out.println("Enter your Religion : ");
		String religion = sc.nextLine();

		System.out.println("Enter your Weight : ");
		Float weight = sc.nextFloat();

		System.out.println("Enter your Height : ");
		Float height = sc.nextFloat();

		System.out.println("Enter your Married Status : ");
		Boolean status = sc.hasNext();

		System.out.println("******************==> Details <==***********************\n");
		p1.Greetings(name);
		p1.getName(name);
		p1.getAge(age);
		p1.getGender(gender);
		p1.getPhone(phone);
		p1.getNationality(nation);
		p1.getAadhaar(aadhaar);
		p1.getPan(pan);
		p1.getAddress(address);
		p1.getOccupation(occ);
		p1.getSpeakLanguages(languages);
		p1.getReligion(religion);
		p1.getWeight(weight);
		p1.getHeight(height);
		p1.getMarriedStatus(status);

		System.out.println("\n******************End***********************");
		sc.close();
	}
}
