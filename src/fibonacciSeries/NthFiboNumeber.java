package fibonacciSeries;

import java.util.Scanner;

public class NthFiboNumeber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n********* Nth Fibonacci Number *********\n");
		int n = 10;

		int start = 0;
		int end = 1;
		int sum = 0;
		int count = 1;
		int ele = 0;
		System.out.print(end + " ");
		for (int i = 1; i <= 15; i++) {
			sum = start + end;
			System.out.print(sum + " ");
			start = end;
			end = sum;
			count++;
			if (count == n)
				ele = sum;
		}
		System.out.println();
		System.out.println(n + "th fib number : " + ele);

		sc.close();
	}
}
