package test_4;

import java.util.Scanner;

public class zadacha_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] array = new int[7];
		int thirdVeriable = 0;

		System.out.print("Enter the numbers for the array: ");

		for (int index = 0; index < array.length; index++) {
			array[index] = sc.nextInt();
		}

		thirdVeriable = array[0];
		array[0] = array[1];
		array[1] = thirdVeriable;
		
		array[2] = array[2] + array[3];
		array[3] = array[2] - array[3];
		array[2] = array[2] - array[3];
		
		array[4] = array[4] * array[5];
		array[5] = array[4] / array[5];
		array[4] = array[4] / array[5];
		
		
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + ", ");

		}
	}
}