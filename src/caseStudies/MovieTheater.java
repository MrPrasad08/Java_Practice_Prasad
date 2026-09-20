package caseStudies;

import java.util.Scanner;

public class MovieTheater {
	String movieName;
	String language;
	float ticketPrice;

	MovieTheater(String movieName, String language, float ticketPrice) {
		this.movieName = movieName;
		this.language = language;
		this.ticketPrice = ticketPrice;
	}

	MovieTheater(MovieTheater m1, float ticketPrice) {
		this.movieName = m1.movieName;
		this.language = m1.language;
		this.ticketPrice = ticketPrice;
	}

	void displayMovieDetails() {
		System.out.println("Movie Name : " + movieName);
		System.out.println("Movie Language : " + language);
		System.out.println("Ticket Price : " + ticketPrice);
	}

	public static void main(String[] args) {
		System.out.println("************ Movie Theater ************\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter movie name : ");
		String mvName = sc.nextLine();
		System.out.println("Enter movie language : ");
		String lang = sc.nextLine();
		System.out.println("Enter ticket price : ");
		float price1 = sc.nextFloat();
		MovieTheater m1 = new MovieTheater(mvName, lang, price1);
		m1.displayMovieDetails();
		System.out.println("Enter second tikcet price : ");
		float price2 = sc.nextFloat();
		MovieTheater m2 = new MovieTheater(m1, price2);
		m2.displayMovieDetails();

		sc.close();
	}
}
