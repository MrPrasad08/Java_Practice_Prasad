package patternsDSA;
import java.util.Arrays;

public class RotateArray {
	public static void main(String[] args) {
		int[] arr = {3,6,4,1,8,0,5};
		int left = 0;
		int right = arr.length-1;
		while(left<right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++;
			right--;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
