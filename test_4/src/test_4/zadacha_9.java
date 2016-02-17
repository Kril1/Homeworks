package test_4;

import java.util.Scanner;

public class zadacha_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// With an additional array
		// System.out.print("Enter the lenght of the array: ");
		//
		// int lenght0 = sc.nextInt ();
		// int[] array = new int [lenght0];
		// int [] copyArray = new int [lenght0];
		// int backwards = lenght0 - 1;
		//
		// System.out.println("Enter the numbers in the array: ");
		//
		// for (int index = 0; index < array.length; index ++){
		// array[index] = sc.nextInt();
		// copyArray[backwards] = array[index];
		// backwards --;
		// }
		// for (int index = 0; index < array.length; index ++){
		// array[index] = copyArray[index] ;
		// System.out.print(array[index]);
		// }

		
		//Without the additional array
		System.out.print("Enter a number for the length of the array: ");
		int length0 = sc.nextInt();

		int[] array = new int[length0];
		int comonSum = 0;

		System.out.print("Enter the numbers for the array: ");

		for (int index = 0; index < array.length; index++) {
			array[index] = sc.nextInt();
		}

		for (int index = 0; index < (array.length - 1) / 2; index++) {
			comonSum = array[index] + array[(array.length - 1) - index];
			array[index] = comonSum - array[index];
			array[(array.length - 1) - index] = comonSum - array[(array.length - 1) - index];
		}

		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + ", ");
		}
	}
}