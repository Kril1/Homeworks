package test_3;

import java.util.Scanner;

public class kiril_ivanov_zadacha_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for A: ");
		int a = sc.nextInt();
		System.out.println("Enter a number fo B: ");
		int b = sc.nextInt();
		int sum = 0;
		while (a <= b) {
			if (a % 3 != 0) {
				int stepen = a * a;
				System.out.print(stepen + ", ");
				sum = sum + stepen;
			}else {
				System.out.print("Skip " + a + ", ");
			}
			if (sum > 200){
				break;
			}
			a++;
		}
	}
}