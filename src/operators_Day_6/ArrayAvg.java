package operators_Day_6;

public class ArrayAvg {
	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		int[] arr = {10,20,30,65,76,83,24};
		for(int num : arr) {
			sum +=  num;
			count++;
		}
		System.out.println(count);
		double average = sum /count;
		System.out.println(average);
	}
}
