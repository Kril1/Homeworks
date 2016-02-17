package test_3;

import java.util.Scanner;

public class kiril_ivanov_zadacha_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if it's prime: ");
		int prime = sc.nextInt();
		boolean notPrime = false;
		for (int del = 2; del <= prime / 2; del++) {
			if (prime % del == 0) {
				System.out.println("Not a prime number!");
				notPrime = true;
				break;
			}
		}
		if (notPrime == false) {
			System.out.println("The number is prime!");
		}
	}
}