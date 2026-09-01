package operators_Day_6;

import java.util.Scanner;

public class PrimeNum {
	void primes(int start, int end) {
		System.out.println("Start : "+start);
		System.out.println("Ending : "+end);
		System.out.println("Prime numbers between "+start+" and "+end+" are : ");
		for (int i = start; i <= end; i++) {
			int count = 0;
			for (int j = 1; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 1) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting number and end number : ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		PrimeNum obj = new PrimeNum();
		obj.primes(start, end);

	}
}
// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97

// 1 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
