package test_2;

import java.util.Scanner;

public class kiril_ivanov_zadacha5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number x=");
		int x = sc.nextInt();
		System.out.println("Enter a number y=");
		int y = sc.nextInt();
		System.out.println("Enter a number z=");
		int z = sc.nextInt();
		if ((x < y) && (y < z)) {
			System.out.println(x + ", " + y + ", " + z);
		}
		if ((x < z) && (z < y)) {
			System.out.println(x + ", " + z + ", " + y);
		}
		if ((y < x) && (x < z)) {
			System.out.println(y + ", " + x + ", " + z);
		}
		if ((y < z) && (z < x)) {
			System.out.println(y + ", " + z + ", " + x);
		}
		if ((z < y) && (y < x)) {
			System.out.println(z + ", " + y + ", " + x);
		}
		if ((z < x) && (x < y)) {
			System.out.println(z + ", " + x + ", " + y);
		}
	}
}