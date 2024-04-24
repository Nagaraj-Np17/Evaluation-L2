package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Question2 {

	public static void main(String[] args) {
		String res = "";
		TreeMap<Integer, String> map = new TreeMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		int arr[] = { 4, 1, 2, 3, 2, 1, 2, 5 };
		Arrays.sort(arr);
		int count = 1;
		for (int i = 1; i <= arr.length; i++) {
			if (i == arr.length || arr[i - 1] != arr[i]) {
				if (!map.containsKey(count)) {
					map.put(count, "");
				}
				map.put(count, map.get(count) + arr[i - 1]);
				count = 1;
			} else {
				count++;
			}
		}
		for (Map.Entry<Integer, String> entry : map.entrySet()) {

			String s = entry.getValue();
			for (int i = 0; i < s.length(); i++) {
				int key = entry.getKey();
				while (key > 0) {
					res = s.charAt(i) + res;
					key--;
				}
			}

		}
		System.out.println(res);
	}

}
