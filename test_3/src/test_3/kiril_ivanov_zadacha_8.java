package test_3;

import java.util.Scanner;

public class kiril_ivanov_zadacha_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a nubmer for N: ");
		int nachalo = sc.nextInt();
		int nachaloPromenliva = nachalo;
		nachaloPromenliva --;
		for (int broika = 1; broika <= nachalo; broika++){
			System.out.print(nachaloPromenliva);
			for (int broika1 = 1; broika1 <= nachalo; broika1++){
				System.out.println(nachaloPromenliva);
			}
		}
		
	}
}