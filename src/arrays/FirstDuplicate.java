package arrays;

public class FirstDuplicate {
	static int firstDuplicate(int[] arr) {
		int ele = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					ele = arr[i];
					return ele;
				}
			}
		}
		return ele;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 7, 8, 2, 1, 1, 3, 0, 9, 10 };

		int fD = firstDuplicate(arr);
		
		System.out.println("First Duplicate : " + fD);
	}
}
