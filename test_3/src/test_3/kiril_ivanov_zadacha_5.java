package test_3;

import java.util.Scanner;

public class kiril_ivanov_zadacha_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter a second number: ");
		int num2 = sc.nextInt();

		while (num1 <= num2) {
			System.out.print(num1 + " ");
			if (num1 == num2) {
				break;
			}
			num1++;
		}
		while (num2 < num1) {
			System.out.print(num2 + " ");
			if (num1 == num2) {
				break;
			}
			num2++;
		}
	}
}