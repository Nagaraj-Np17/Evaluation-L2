package com.test;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char ch = sc.next().charAt(0);

		int len = ch - 65 + 1;
		char startChar = (char) 65;

		for (int row = 0; row < len; row++) {
			for (int col = row; col < len - 1; col++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= row; k++) {
				if (k == 0 || k == row) {
					System.out.print(startChar + " ");
				} else {
					System.out.print("  ");
				}
			}
			startChar++;
			System.out.println();
		}

		startChar -= 2;
		for (int row = len - 1; row > 0; row--) {
			for (int col = len - 1; col > row - 1; col--) {
				System.out.print(" ");
			}
			for (int k = 0; k < row; k++) {
				if (k == 0 || k == row - 1) {
					System.out.print(startChar + " ");
				} else {
					System.out.print("  ");
				}
			}
			startChar--;
			System.out.println();
		}

	}
}
