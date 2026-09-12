package if_Else_LangFund;

import java.util.Scanner;

public class Greater100 {
	void result(int marks) {
		if (marks >= 90 && marks <= 100) {
			System.out.println("Entra miku em pani ledaa entha saduvu saduvu anii edustharu !!");
			System.out.println("Tisuko niku " + marks + " vacahhayii !!");
		} else {
			System.out.println("Chaduvukoni edraa munduu entha sepu ahh bigg boss uu and reels ey naa !!");
			System.out.println("Mii amma vallau enduku papmutunnaru beyy ninnu 😘😘😘");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Greater100 obj = new Greater100();
		System.out.println("********** Greater than 100 **********");
		System.out.println("Enter your marks : ");
		int marks = sc.nextInt();
		obj.result(marks);
		sc.close();
	}
}
