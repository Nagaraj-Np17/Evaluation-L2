package com.test;

public class Question5 {

	public static void main(String[] args) {
		int top = 0;
		int bot = 5;
		int right = 5;
		int col = -2;
		int row = -1;
		int left = -1;
		int printer = 1;
		int round = 0;
		int arr[][] = new int[5][5];
		while (bot > top) {
			col += 2;
			row++;
			while (col < right) {
				arr[row][col] = printer;
				col++;
			}
			right--;
			top++;
			left++;
			while (row < bot) {
				arr[row][col] = printer;
				row++;
			}
			top--;
			bot--;
			row--;
			col--;
			while (col > left) {
				arr[row][col] = printer;
				col--;
			}
			row--;
			col++;
			while (row > top) {
				arr[row][col] = printer;
				row--;
			}

			printer = (printer == 1) ? 0 : 1;
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arr[i]);
			}
			System.out.println();
		}

	}

}
