package com.languageFundamentalsLoops;

import java.math.BigInteger;

public class ForLoop1 {
	public static void main(String[] args) {

		for (byte b = 0; b < 127; b++) {
			System.out.print(b + " ");
		}
		System.out.println();

		for (short s = 0; s <= 10; s++) {
			System.out.print(s + " ");
		}
		System.out.println();

		for (char i = 65; i <= 90; i++) {
			System.out.print(i + " ");
		}

		BigInteger start = new BigInteger("1");
		for (BigInteger bi = start; bi.compareTo(start) <= 100; bi = bi.add(bi)) {
			System.out.print(bi+" ");
		}

	}
}
