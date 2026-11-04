package arrays__2D;

import java.util.Scanner;

public class ArrayCreation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many rows : ");
		int row = sc.nextInt();
		System.out.println("Enter how many columns : ");
		int col = sc.nextInt();
		int[][] arr = new int[row][col];

		System.out.println("Enter elements into the array : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int[] ele : arr) {
			for (int a : ele) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}
}
