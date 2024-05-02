package com.lift;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LiftMain {
	static Scanner sc = new Scanner(System.in);
	public static List<Lift> lift = new ArrayList<Lift>();

	public static void liftSetPosition() {
		for (Lift l : lift) {
			System.out.println(
					"Lift Name" + l.liftName + "\nPosition" + l.position + "\nDo you want change The Position (Y/N)");
			String valid = sc.next();
			if (valid.equals("Y")) {
				System.out.print("Enter The Position of a Lift range(0-10)");
				int pos = sc.nextInt();
				l.setPosition(pos);
			}

		}

	}

	private static void liftSetPosition(String lname) {
		for (Lift l : lift) {
			if (l.liftName.equalsIgnoreCase(lname)) {
				System.out.print("Enter The Position of a Lift range(0-10)");
				int pos = sc.nextInt();
				l.setPosition(pos);
				break;

			}

		}

	}

	public List<Lift> getLiftData() {
		return lift;
	}

	public static void liftView() {
		for (Lift l : lift) {
			System.out.println("Name    " + l.liftName + "\nPosition   " + l.position + "\nUnderMAintanance   "
					+ l.underMAintanance + "Restrict Start" + l.rstart + " Restrict End" + l.rend);
		}
	}

	public static void liftView(String name) {
		for (Lift l : lift) {
			if (l.liftName.equals(name)) {
				System.out.println("Name    " + l.liftName + "\nPosition   " + l.position + "\nUnderMAintanance   "
						+ l.underMAintanance + "Restrict Start" + l.rstart + " Restrict End" + l.rend);

				break;
			}

		}
	}

	public static void main(String[] args) {
		User_View view = new User_View();
		System.out.println("Enter The Total Number Of Lift");

		int liftCount = sc.nextInt();
		for (int i = 1; i <= liftCount; i++) {
			Lift l = new Lift("L" + i, 0, 0, 10, false);
			lift.add(l);
		}

		while (true) {
			System.out.println(
					"1.View Lift Info\n2.Access Lift\n3.Set Positions All\n4.Set Positions Specific Lift\n6.Exit .Enter The Choice:");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				liftView();
				break;

			}
			case 2: {
				String name = view.useLift();
				liftView(name);
				break;
			}
			case 3: {
				liftSetPosition();
				break;
			}
			case 4: {
				System.out.println("Enter The List Name to Change Position:");
				String lname = sc.next();
				liftSetPosition(lname);
				break;
			}
			case 5: {
				System.out.println("Enter the Lift Name ");
				String lname = sc.next();
				System.out.print("Enter the start position");
				int start = sc.nextInt();
				System.out.print("Enter the start position");
				int end = sc.nextInt();
				restrictLift(lname, start, end);

			}
			case 6: {
				System.out.println("Exiting....");

				return;
			}
			default:
				System.out.print("Invalid");
			}
		}

	}

	private static void restrictLift(String lname, int start, int end) {
		for (Lift l : lift) {
			if (l.liftName.equals(lname)) {
				l.setRend(start);
				l.setRend(end);
			}
		}

	}
}