package arrays;

import java.util.Arrays;

public class ArrayFrequency {
	void count(int[] arr) {
		int maxCount = 1;
		int maxEle = 0;
		int minCount = 1;
		int minEle = 1;
		for (int i = 0; i < arr.length - 1; i++) {
			int count = 1;

			boolean found = false;
			for (int k = 0; k < i; k++) {
				if (arr[k] == arr[i]) {
					found = true;
					break;
				}
			}
			if (found)
				continue;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				maxEle = arr[i];
			} else  {
				minCount = count;
				minEle = arr[i];
			}
			System.out.println(arr[i] + " => " + count);
//			if (count == 1) {
//				System.out.println(arr[i] + " => " + count);
//				break;
//			}
		}
		System.out.println("Maximum Element : " + maxEle + " Count : " + maxCount);
		System.out.println("Minimum Element : " + minEle + " Count : " + minCount);
	}

	public static void main(String[] args) {
		System.out.println("*********** Frequency Count **************");
		int[] arr = { 2, 3, 1, 3, 2, 4, 5, 6, 4, 3, 5, 1, 2, 3 };

		System.out.println(Arrays.toString(arr));
		ArrayFrequency obj = new ArrayFrequency();
		obj.count(arr);
	}
}
