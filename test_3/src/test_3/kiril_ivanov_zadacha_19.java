package test_3;

import java.util.Scanner;

public class kiril_ivanov_zadacha_19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 10 and 99: ");
		int startNumber = sc.nextInt();

		while (startNumber != 1) {
			if (startNumber % 2 == 0) {
				startNumber = startNumber / 2;
				System.out.print(startNumber + ", ");
			} else {
				startNumber = ((startNumber * 3) + 1);
				System.out.print(startNumber + ", ");
			}
		}
	}
}
