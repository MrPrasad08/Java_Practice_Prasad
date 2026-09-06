package oops;

public class DuplicateMain extends DuplicatesEnc {
	void msg() {
		System.out.println("Shows duplicates functionality in DuplicateMain\n");
	}

	public static void main(String[] args) {
		DuplicatesEnc obj = new DuplicateMain();
		int[] arr = { 10, 2, 4, 2, 10, 4, 1, 6, 7, 6, 2, 2};
		obj.msg();
		obj.duplicates(arr);
	}
}
