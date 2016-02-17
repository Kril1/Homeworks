package test_3;

import java.util.Scanner;

public class kiril_ivanov_zadacha_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = -10;
		while (x <= 10) {
			if (x % 2 != 0) {
				System.out.println(x);
			}x++;
		}
	}
}