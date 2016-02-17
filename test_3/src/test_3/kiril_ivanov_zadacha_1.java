package test_3;

import java.util.Scanner;

public class kiril_ivanov_zadacha_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = { 10, 22, 43, 64, 21 };

		for (int i = 4; i >= 0; i--) {
			if (a[i] > 21) {
				a[i] = (a[i] + 1) % (i + 1);
				i++;
			} else {
				a[i] = a[i] * 2;
				i--;
			}
			if (i >= 0) {
				System.out.println(a[i]);
			}
		}

	}
}