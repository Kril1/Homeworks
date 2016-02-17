package test_3;

import java.util.Scanner;

public class kiril_ivanov_zadacha_25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//The number must be up to 25 to work!
		System.out.println("Enter a number for N! = ");
		
		int n = sc.nextInt();
		long sum = 1;
		int goingUp = 1;
		
		while (goingUp <= n) {
			sum = sum * goingUp;
			goingUp++;
		}
		System.out.println(sum);
	}
}
