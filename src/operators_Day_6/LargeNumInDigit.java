package operators_Day_6;

public class LargeNumInDigit {
	void digit(int num) {
		int large = 0;

		while (num > 0) {
			int ele = num % 10;
			if (ele >= large) {
				large = ele;
			}
			num = num / 10;
		}
		System.out.println("Largest Number : " + large);
	}

	public static void main(String[] args) {
		LargeNumInDigit obj = new LargeNumInDigit();
		obj.digit(23868947);
	}
}
