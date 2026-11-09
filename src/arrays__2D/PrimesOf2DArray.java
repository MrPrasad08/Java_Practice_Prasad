package arrays__2D;

public class PrimesOf2DArray {

	static boolean isPrime(int num) {
		boolean status = true;
		if (num == 0 || num == 1) {
			return false;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				status = false;
				break;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		System.out.println("*********** 2D - Array ***************");
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (isPrime(arr[i][j])) {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
