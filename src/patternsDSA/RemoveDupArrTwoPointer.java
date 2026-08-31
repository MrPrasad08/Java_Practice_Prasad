package patternsDSA;

public class RemoveDupArrTwoPointer {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 4, 5, 5, 6, 6, 8, 9, 11, 11 };
		int left = 0;
		int right = 1;
		int n = arr.length;
		
		while (right < n) {
			if (arr[left] == arr[right]) {
				right++;
			} else {
				left++;
				arr[left] = arr[right];
				right++;
			}
		}
		for (int i = 0; i <= left; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
