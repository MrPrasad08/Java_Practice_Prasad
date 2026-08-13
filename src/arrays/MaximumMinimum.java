package arrays;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class MaximumMinimum {
	int MaxMin() {
		List<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int len = sc.nextInt();
		System.out.println("Enter the elements ");
		for(int i=0; i<len; i++) {
			list.add(sc.nextInt());
		}
		for(int i=0; i<len; i++) {
			System.out.print(list.get(i)+" ");
		}
		return 0;
	}
	public static void main(String[] args) {
		List<Integer> ref = new ArrayList<>();
		ref.add(30);
		ref.add(10);
		ref.add(20);
		ref.add(30);
		ref.add(5);
		ref.add(9);
		int min = ref.get(0);
		int max = ref.get(0);
		for(int i=0; i<ref.size(); i++) {
			if(ref.get(i) < min) {
				min = ref.get(i);
			}
			if(ref.get(i) > max) {
				max = ref.get(i);
			}
			
		}
		System.out.println("Minimum : " + min);
		System.out.println("Maximum : " +max);
		MaximumMinimum obj = new MaximumMinimum();
		obj.MaxMin();
	}
}
