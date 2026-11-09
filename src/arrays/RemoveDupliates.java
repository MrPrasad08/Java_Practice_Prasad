package arrays;


public class RemoveDupliates {
	public static void main(String[] args) {
		int[] arr = {0,0,1,1,2,2,3,3,4,5,6,7,8,9};
		
		int first = 0;
		int second = 1;
		
		while (second < arr.length) {
			if (arr[first] == arr[second]) {
				second++;
			}
			else if(arr[first] != arr[second]){
				first++;
				arr[first] = arr[second];
				second++;
			}
		}
		
		for(int i=0; i<=first; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
