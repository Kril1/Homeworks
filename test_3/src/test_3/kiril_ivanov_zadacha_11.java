package test_3;

import java.util.Scanner;

public class kiril_ivanov_zadacha_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int n = sc.nextInt();

		for (int col = 1; col < n * 2; col = col + 2) {
			for (int prazno = 0; prazno < ((n - 1 - col / 2)); prazno++) {
				System.out.print(" ");
			}
			for (int pylno = 0; pylno < col; pylno++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}