package test_3;

import java.util.Scanner;

public class kiril_ivanov_zadacha_22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for N: ");
		int n = sc.nextInt();
		int sum = 0;
		while (sum < 10) {
			if ((n % 2 == 0) || (n % 3 == 0) || (n % 5 == 0)) {
				sum++;
				System.out.print(sum + ":" + n + "; ");
			}
			n++;
		}

	}
}