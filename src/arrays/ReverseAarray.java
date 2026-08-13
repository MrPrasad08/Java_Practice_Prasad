package arrays;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAarray {
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		arr.add(28);
		arr.add(69);
		arr.add(34);
		arr.add(12);
		arr.add(85);
		System.out.print("Before Reverse : ");
		for(int i=0; i<arr.size(); i++) {
			System.out.print(arr.get(i)+" ");
		}
		System.out.print("\nAfter Reverse : ");
		for(int i=arr.size()-1; i>=0; i--) {
			System.out.print(arr.get(i)+" ");
		}
	}
}
