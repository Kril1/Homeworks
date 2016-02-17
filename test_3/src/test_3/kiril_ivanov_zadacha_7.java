package test_3;

import java.util.Scanner;

public class kiril_ivanov_zadacha_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = 3;
		int n = sc.nextInt ();
		while (n > 0) {
		if (x % 3 == 0) {
		System.out.print(x + ", "); 
		n--;
		x ++;
		} else x ++;
		
		}
		
	}
}