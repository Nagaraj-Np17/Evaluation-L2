package com.lift;

import java.util.Scanner;

public class User_View {
	Scanner sc = new Scanner(System.in);
	LiftOperations op = new LiftOperations();

	public String useLift() {
		System.out.println("Enter The Current Floor:");
		int start = sc.nextInt();
		System.out.println("Enter The Destination Floor:");
		int end = sc.nextInt();
		return (op.sentLift(start, end));

	}
}
