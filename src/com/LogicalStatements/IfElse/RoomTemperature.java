package com.LogicalStatements.IfElse;

import java.util.Scanner;

public class RoomTemperature {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float nrmlRoomTemp = 32.0f;
		System.out.println("Enter your room temperature : ");
		float roomTemp = sc.nextFloat();
		if (roomTemp >= nrmlRoomTemp) {
			System.out.println(
					"Your room temperature " + roomTemp + " is above the normal room temperature " + nrmlRoomTemp);
		} else {
			System.out.println("Your room temperature " + roomTemp + " is not above " + nrmlRoomTemp);
		}
		sc.close();
	}
}
