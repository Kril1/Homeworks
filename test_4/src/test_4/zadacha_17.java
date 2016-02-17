package test_4;

import java.util.Scanner;

public class zadacha_17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int length0 = sc.nextInt();
		
		int[] array = new int[length0];
		
		boolean nazyben = false;
		
		System.out.println("Enter numbers for the array: ");
		for (int index = 0; index < array.length; index++) {
			array[index] = sc.nextInt();
		}
		for (int index = 1; index < array.length - 1; index++) {
			if (((array[index-1] < array[index]) && (array[index] > array[index+1])) || ((array[index-1] > array[index]) && (array[index] < array[index+1]))){
				nazyben = true;
			}
		} if (nazyben == false){
			System.out.println("The array is not jagged!");
		} else {
			System.out.println("The array is jagged!");
		}
	}
}
