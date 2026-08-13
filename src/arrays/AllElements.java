package arrays;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class AllElements {
	public static void main(String[] args) {
		int sum = 0;
		int[] arr = { 2, 7, 9, 1, 0, 3, 18 };
		int n = arr.length;
		int large = arr[0];
		int second = arr[0];
		for(int i=0; i<n; i++) {
			if(arr[i] >= large) {
				second = large;
				large = arr[i];
			}
		}
		System.out.println(large);
		System.out.println(Arrays.toString(arr));
	}

}
