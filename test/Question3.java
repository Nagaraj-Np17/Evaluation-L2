package com.test;

import java.util.Arrays;

public class Question3 {

	public static void main(String[] args) {
		int arr1[] = { 9, 2, 8, 1, 3, 5, 6, 7, 3, 1, 1, 6 };
		int arr2[] = { 7, 8, 4, 6, 2, 1, 9, 9, 7 };

		// System.out.println(a + b);
		int max = (arr1.length > arr2.length) ? arr1.length : arr2.length;
		max += 1;
		int[] res = new int[max];
		System.out.println(res.length);
		int diff = Math.abs(arr1.length - arr2.length);
		int len1 = arr1.length;
		int len2 = arr2.length;
		int add = 0;
		int i = 0;
		for (i = len2 - 1; i >= 0; i--) {
			int sum = arr2[i] + arr1[i + diff] + add;
			System.out.println(sum + "-->" + add);
			if ((sum) > 9) {
				res[--max] = (sum % 10);
				add = sum / 10;
				System.out.println(">10" + res[max]);
			} else {
				res[--max] = sum;
				System.out.println("<10" + res[max]);
				add = 0;
			}
		}
		System.out.println(Arrays.toString(res));

		while (diff > 0) {

			int sum = arr1[--diff] + add;

			if ((sum) > 9) {
				res[--max] = (sum % 10);
				add = sum / 10;

			} else {
				res[--max] = sum;
				add = 0;

			}

		}
		System.out.println(Arrays.toString(res));
	}

}
