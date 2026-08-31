package operators_Day_6;

public class PrimeNum {
	void prime(int num) {

		for (int i = 1; i <= num; i++) {
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
		System.out.println("main method started !!");
		PrimeNum obj = new PrimeNum();
		obj.prime(100);
	}
}
// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97

// 1 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
