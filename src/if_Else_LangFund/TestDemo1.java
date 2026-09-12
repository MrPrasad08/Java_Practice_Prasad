package if_Else_LangFund;

import java.util.Scanner;

public class TestDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your faculty name : ");
		String name = sc.nextLine();
		name.toLowerCase();
		if (name.equals("surekha")) {
			System.out.println("Mii faculty " + name + " chala machollu and chala baguntaru and my favourite MISS !!!");
		} else {
			System.out.println("Nuvvu manchodivi kaadu raa !!! manchi MISS nii faculty gaa chuusuko");
		}
		sc.close();
	}
}
