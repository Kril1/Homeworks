package test_3;

import java.util.Scanner;

public class kiril_ivanov_zadacha_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for N: ");
		for (int n = sc.nextInt(); ((10<=n) && (n<=200)); n-- ){
			if (n % 7 == 0){
				System.out.println(n);
			}
		}
	}
}