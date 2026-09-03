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
		for (int i = 0; i < n - 1; i++) {
			boolean found = false;
			for (int k = 0; k < i; k++) {
				if (arr[k] == arr[i]) {
					found = true;
					break;
				}
			}
			if (found)
				continue;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[j] + " ");
					break;
				}
			}
		}
	}
}
