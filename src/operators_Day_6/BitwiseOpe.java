package operators_Day_6;

public class BitwiseOpe {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		int result = a++ + ++b*2- --a;
		System.out.println(result);
		int A = --a;
		System.out.println(A);
		
		
	}
}

