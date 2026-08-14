package patternsDSA;

public class TwoPointersAsc {
	static void TargetSum(int[] arr) {
		System.out.println("Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n\nValues for target Sum : ");
		int target = 11;
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			int sum = arr[left] + arr[right];

			if (sum == target) {
				System.out.println(arr[left] + " + " + arr[right] + " = " + target);
				left++;
				right--;
			} else if (sum > target) {
				right--;
			} else {
				left++;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 6, 7, 8, 9, 13 };
		TargetSum(arr);
	}
}
