package oops;

abstract class DuplicatesEnc {
	abstract void msg();

	void duplicates(int[] arr) {
		int n = arr.length;
		if (n == 1) {
			System.out.println("Enter valid length");
			return;
		}
		System.out.print("Duplictes in the array : ");
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
				}
			}
		}
	}
}
