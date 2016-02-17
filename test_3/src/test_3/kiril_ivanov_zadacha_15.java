package test_3;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class kiril_ivanov_zadacha_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for N: ");
		int n = sc.nextInt();
		int ver = 1;
		int sum = 0;
		do {
			sum = sum + ver;
			ver++;
		} while (n >= ver);
		System.out.println(sum);
	} 
}
