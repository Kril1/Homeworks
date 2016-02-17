package test_2;

import java.util.Scanner;

public class kiril_ivanov_zadacha8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a four digit number:");
		int fourDigit = sc.nextInt();
		int lastDigit = fourDigit % 10;
		int thirdDigit = fourDigit;
		thirdDigit = ((thirdDigit / 10) % 10);
		int secondDigit = fourDigit;
		secondDigit = (((secondDigit / 10) / 10) % 10);
		int firstDigit = fourDigit;
		firstDigit = ((((firstDigit / 10) / 10) / 10) % 10);

		int x = ((firstDigit * 10) + lastDigit);
		int y = ((secondDigit * 10) + thirdDigit);
		if (x > y) {
			System.out.println(x + ">" + y);
		}
		if (y > x) {
			System.out.println(y + ">" + x);
		}
		if (x == y) {
			System.out.println(x + "=" + y);
		}
	}
	
}