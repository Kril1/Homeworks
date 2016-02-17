package test_2;

import java.util.Scanner;

public class kiril_ivanov_zadacha_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an hour: ");
		int hour = sc.nextInt();

		if ((hour > 4) && (hour <= 9)) {
			System.out.println("Good morning!");
		}
		if ((hour > 9) && (hour <= 18)) {
			System.out.println("Good day!");
		}
		if ((hour <= 4) || (hour > 18)) {
			System.out.println("Good evening");
		}

	}
}
