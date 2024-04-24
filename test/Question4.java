package com.test;

public class Question4 {
	public static void main(String[] args) {
		int arr[] = { 3, -1, 6, 1, -5, 1, 3, -8 };
		int max = 0;
		int start = 0;
		int end = 0;
		int sum = 0;
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {

				if (sum > max) {
					max = sum;
					sum = 0;

					end = i;
					start = i - temp;
					temp = 0;

				}

			} else if (i == arr.length - 1) {

				sum += arr[i];
				temp++;
				System.out.println("sum=" + sum);
				if (sum > max) {
					max = sum;
					sum = 0;
					end = i + 1;
					start = end - temp;
				}

			} else {
				sum += arr[i];
				temp++;
			}

		}
		System.out.println("Max =" + max);

		System.out.println("Elements---");
		for (int i = start; i < end; i++) {
			System.out.println(arr[i]);
		}
	}
}
