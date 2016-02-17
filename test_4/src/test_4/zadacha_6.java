package test_4;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class zadacha_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the lenght of the first array: ");

		int lenghtO = sc.nextInt();
		int[] array = new int[lenghtO];

		System.out.print("Enter the lenght of the second array: ");

		int lenght1 = sc.nextInt();
		int[] array1 = new int[lenght1];

		boolean isEqual = true;

		System.out.print("Enter the numbers for the first array: ");
		for (int index = 0; index < array.length; index++) {
			array[index] = sc.nextInt();
		}
		
		System.out.print("Enter the numbers for the second array: ");
		for (int index = 0; index < array1.length; index++) {
			array1[index] = sc.nextInt();
		}
		
		if (array1.length == array.length) {

			for (int index = 0; index < array.length; index++) {
				if (array[index] != array1[index]) {
					System.out.println("The arrays are not eaqual");
					isEqual = false;
					break;
				}
			}

			if (isEqual == true) {
				System.out.println("The arrays are eaqual");
			}
		} else {
			System.out.println("The arrays are not with the same length!");
		}
	}
}