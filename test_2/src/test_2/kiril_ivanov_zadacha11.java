package test_2;

import java.util.Scanner;

public class kiril_ivanov_zadacha11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a three digit number:");

		int x = sc.nextInt();
	
		int lastDigit = x % 10;
		int secondDigit = ((x / 10) % 10);
		int firstDigit = (((x / 10) / 10) % 10);
	
		int firstReminder = x % firstDigit;
		int secondReminder = x % secondDigit;
		int thirdReminder = x % lastDigit;

		if (firstReminder == 0) {
			System.out.println(x + " is devided by " + firstDigit);
		} else {
			System.out.println(x + " is not devided by " + firstDigit);
		}
		
		if (secondReminder == 0) {
			System.out.println(x + " is devided by " + secondDigit);
		} else {
			System.out.println(x + " is not devided by " + secondDigit);
		}
		
		if (thirdReminder == 0) {
			System.out.println(x + " is devided by " + lastDigit);
		} else {
			System.out.println(x + " is not devided by " + lastDigit);
		}
	}
}