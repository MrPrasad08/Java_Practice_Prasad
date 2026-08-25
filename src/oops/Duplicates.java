package oops;

public class Duplicates {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 3, 6, 3, 5, 7 };
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			boolean found = false;
			for (int j = i; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					found = true;
				}
			}
			if (!found)
				continue;

			if (count == 1) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
