package arrays;
import java.util.Set;
import java.util.HashSet;
public class TestDemo {
public static void main(String[] args) {
	Set<Integer> arr = new HashSet<>();
	arr.add(10);
	arr.add(45);
	arr.add(67);
	arr.add(58);
	arr.add(12);
	int sum =0;
	for(int n : arr) {
		sum += n;
	}
	System.out.println("Sum : " +sum);
}
}
