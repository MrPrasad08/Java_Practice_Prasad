package arrays;

public class Traversal {
	public static void main(String[] args) {
		int[] arr = new int[6];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		// Traverse Each Element
		System.out.println("Traversing............");
		for (int n : arr) {
			System.out.print(n + " ");
		}
		// Insert the element at particular position
		int pos = 2;
		for (int i = arr.length - 1; i > pos; i--) {
			arr[i] = arr[i - 1];
		}
		arr[pos] = 25;
		System.out.println("\n\nInserting............");
		for (int n : arr) {
			System.out.print(n + " ");
		}

		// Deleting the element from the array
		int del = 3;
		for (int i = del; i < arr.length-1; i++) {
			arr[i] = arr[i + 1];
		}
		int n = arr.length;
		n--;
		System.out.println("\n\nDeleting...............");
		
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
