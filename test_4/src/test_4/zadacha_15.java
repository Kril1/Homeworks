package test_4;

import java.util.Scanner;

public class zadacha_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter the lenght of the array: ");
		int lenght0 = sc.nextInt();

		double[] array = new double[lenght0];

		// Turns out this doesn't work if there are 2 equal numbers, like 9 and
		// 9 or 10 and -10
		// double biggestNumber = 0;
		// double secondBiggest = 0;
		// double thirdBiggest = 0;
		// int index1 = 0;
		// int index2 = 0;
		//
		// System.out.print("Please enter the numbers for the array: ");
		// for (int index = 0; index < array.length; index++) {
		// array[index] = sc.nextDouble();
		// }
		//
		// for (int index = 0; index < array.length; index++) {
		// if (array[index] < 0) {
		// array[index] = array[index] * -1;
		// }
		// if (array[index] > biggestNumber) {
		// biggestNumber = array[index];
		// index1=index;
		// System.out.println(index1);
		//
		// }
		// }
		// for (int index = 0; index < array.length; index++) {
		// if (array[index] < 0) {
		// array[index] = array[index] * -1;
		// }
		// if ((array[index] > secondBiggest)&&(array[index] != array[index1]))
		// {
		// secondBiggest = array[index];
		// index2 = index;
		// }
		// }
		// for (int index = 0; index < array.length; index++){
		// if (array[index] < 0) {
		// array[index] = array[index] * -1;
		// }
		// if ((array[index] > thirdBiggest)&&(array[index] !=
		// array[index1])&&(array[index] != array[index2])) {
		// thirdBiggest = array[index];
		// }
		// }
		// System.out.println(biggestNumber + "," + secondBiggest + ", " +
		// thirdBiggest);

		double first = Integer.MIN_VALUE;
		double secondMax = Integer.MIN_VALUE;
		double thirdMax = Integer.MIN_VALUE;
		
		System.out.println("Enter the numbers in the array: ");
		
		for (int index = 0; index < array.length; index++){
			array[index] = sc.nextDouble();
		}

		for (int index = 0; index < array.length; index++) {
			double currentNumber = array[index];

			if (currentNumber >= first) {
				thirdMax = secondMax;
				secondMax = first;
				first = currentNumber;
			} else if (currentNumber >= secondMax) {
				thirdMax = secondMax;
				secondMax = currentNumber;
			} else if (currentNumber >= thirdMax) {
				thirdMax = currentNumber;
			}
		}

		System.out.print(first + ", " + secondMax + ", " + thirdMax);

	}
}