package test_3;

import java.util.Scanner;

public class kiril_ivanov_zadacha_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for N: ");
		int n = sc.nextInt();
		System.out.println("Enter a number for M: ");
		for (int m = sc.nextInt(); (10 <= n) && (m <= 5555); m--) {
			if ((n <= m) && (m % 50 == 0)) {
				System.out.println(m);
			}
		}
	}
}