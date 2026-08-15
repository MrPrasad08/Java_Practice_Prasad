package arrays;

public class FrequencyCount {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 10, 5, 2, 20, 30 };
		for (int i = 0; i < arr.length - 1; i++) {
			boolean found = true;
			int count = 0;
			for (int k = 0; k < i; k++) {
				if (arr[i] == arr[k]) {
					found = false;
					break;
				}
			}
			if (!found)
				continue;

			for (int j = i; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
//					break;
				}
			}
			System.out.println(arr[i] + " => " + count);
		}
	}
}
