package test_4;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class zadacha_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int firstNumber = sc.nextInt();

		int[] array = new int[10];
		array[0] = firstNumber;
		array[1] = firstNumber;

		for (int index = 2; index < array.length; index++) {
			array[index] = array[index-1] + array[index -2];

		}
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
	}
}
