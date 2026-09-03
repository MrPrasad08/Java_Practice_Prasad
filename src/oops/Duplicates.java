package oops;

public class Duplicates {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 3, 1, 1, 6, 3, 5, 7, 1, 2, 4 };
		for (int i = 0; i < arr.length-1; i++) {
			boolean found = false;
			int count = 0;
			for (int k = 0; k < i; k++) {
				if (arr[k] == arr[i]) {
					found = true;
					break;
				}
			}
			if (found)
				continue;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] == arr[i]) {
//					count++;
					System.out.print(arr[i] + " ");
					break;
				}
			}
//			if (count == 1) {
//				System.out.print(arr[i] + " ");
//			}
		}
	}
}
