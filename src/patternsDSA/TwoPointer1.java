package patternsDSA;

public class TwoPointer1 {
	public static void main(String[] args) {
		int[] arr = {9,8,7,6,5,4,3,2};
		int left = 0;
		int right = arr.length-1;
		int target = 13;
		while(left<right) {
			int sum = arr[left] + arr[right];
			if(sum == target) {
				System.out.println(arr[left]+" + "+arr[right]+" = " +target);
				left++;
				right--;
			}
			else if(sum < target){
				right--;
			}
			else {
				left++;
			}
		}
	}
}