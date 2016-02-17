package test_3;

import java.util.Scanner;

public class kiril_ivanov_zadacha_18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int start1 = 1;
		int start2 = 1;
		System.out.println("Enter a the first multiplier: ");
		int ver1 = sc.nextInt();
		System.out.println("Enter a the second multiplier: ");
		int ver2 = sc.nextInt();

		System.out.println(start1 + "*" + start2 + " = " + start1 * start2);

		while ((start1 < ver1) && (start2 < ver2)) {
			start1++;

			System.out.println(start1 + "*" + start2 + " = " + start1 * start2);

			start1--;
			start2++;

			System.out.println(start1 + "*" + start2 + " = " + start1 * start2);

			start1++;

			System.out.println(start1 + "*" + start2 + " = " + start1 * start2);
		}
	}
}
