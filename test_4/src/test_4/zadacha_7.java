package test_4;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class zadacha_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the lenght of the array: ");

		int lenghtO = sc.nextInt();
		int[] array = new int[lenghtO];

		System.out.print("Enter the numbers for the array: ");
		for (int index = 0; index < array.length; index++) {
			array[index] = sc.nextInt();
		}

		int[] array1 = new int[lenghtO];

		for (int index = 0; index < array1.length; index++) {
			if ((index != 0) && (index != array1.length - 1)) {
				array1[index] = array[index - 1] + array[index + 1];
			}
			if (index == 0){
				array1[index] = array[index+1];
			}
			if (index == array1.length - 1){
				array1[index] = array[index-1];
			}
		}
		for (int index = 0; index < array1.length; index++) {
			System.out.print(array1[index] + ", ");
		}
	}
}