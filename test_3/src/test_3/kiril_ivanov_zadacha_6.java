package test_3;

import java.util.Scanner;

public class kiril_ivanov_zadacha_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = 1;
		int n = sc.nextInt();
		int sum = 0;
		while (n >= x) {
			sum = sum + x;
				x++;
		}System.out.println(sum);
		
	}
}