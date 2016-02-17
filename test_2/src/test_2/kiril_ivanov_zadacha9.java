package test_2;

import java.util.Scanner;

public class kiril_ivanov_zadacha9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a double digit number a = ");
		int a = sc.nextInt();
		System.out.println("Enter a double digit number b = ");
		int b = sc.nextInt();
		int x = a * b;
		int y = x % 10;

		if (x % 2 == 0) {
			System.out.println(x + ", " + y + " The number is even");
		}else {
			System.out.println(x + ", " +  y + " The number is not even");
		}
	}
}