package if_Else_LangFund;

import java.util.Scanner;

public class Divisible5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbeer : ");
		int num = sc.nextInt();
		if (num % 5 == 0) {
			System.out.println("Nv cheppina number 5 tho divisible ayyithundii roiiii !!!");
		} else {
			System.out.println("Sarigga number chepu beyy !!");
		}
		sc.close();
	}
}
