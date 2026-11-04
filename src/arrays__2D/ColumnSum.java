package arrays__2D;

public class ColumnSum {
	public static void main(String[] args) {
		int[][] arr = { { 5, 2, 8 }, { 0, 4, 1 }, { 3, 6, 7 } };

		int row = arr.length;
		int col = arr[0].length;

		for (int j = 0; j < col; j++) {
			for (int i = 0; i < row; i++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
	}
}
