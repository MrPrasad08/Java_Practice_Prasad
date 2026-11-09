package fibonacciSeries;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = 0;
		int end = 1;

		int sum = 0;

		System.out.println("Enter the range : ");
		int range = sc.nextInt();
		System.out.println();
		System.out.print(start + " " + end + " ");
		for (int i = 1; i <= range; i++) {
			sum = start + end;
			System.out.print(sum + " ");
			start = end;
			end = sum;
		}
		
		sc.close();
	}
}
