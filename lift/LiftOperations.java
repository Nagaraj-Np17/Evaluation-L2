package com.lift;

import java.util.ArrayList;
import java.util.List;

public class LiftOperations {
	LiftMain lm = new LiftMain();

	List<Lift> lift = lm.getLiftData();
	List<Lift> currLift = new ArrayList<>();
//	Map<String,>

	public String sentLift(int start, int end) {
		String name = "";
		int min = 11;
		for (Lift l : lift) {
			int current = (int) Math.abs(start - l.position);
			System.out.println("Current" + current);
			if (current <= min) {
				System.out.println("Min" + min + "cur" + current);

				if (min == current) {
					System.out.println("000");
					if ((start < end) && (l.position < start)) {
						System.out.println("-min-");
						name = l.liftName;
						min = current;
					} else if ((start > end) && (l.position > start)) {
						System.out.println("-max-");
						name = l.liftName;
						min = current;
					}

				} else {
					System.out.println("-none-");
					name = l.liftName;
					min = current;
				}

			}
		}
		System.out.println(name + " is Arriving");
		for (Lift l : lift) {
			if (l.liftName.equals(name)) {
				l.setPosition(end);
			}
		}
		return name;
	}

}
