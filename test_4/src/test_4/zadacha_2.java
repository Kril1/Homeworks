package test_4;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class zadacha_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the lenght of the array: ");
	
		int lenghtO = sc.nextInt();
		int[] array = new int[lenghtO];

		int[] CopyOfArray = new int[array.length];
		int backwards = CopyOfArray.length;
	
		System.out.print("Enter the numbers for the array: ");
		for (int index = 0; index < array.length; index++) {
			array[index] = sc.nextInt();
		}
	
		for (int index = 0; index < CopyOfArray.length/2; index++) {
			CopyOfArray[index]=array[index];
			CopyOfArray[backwards -1]=array[index];
			backwards --;
		}
		
		
		for (int index = 0; index < CopyOfArray.length; index++) {
			System.out.print(CopyOfArray[index] + " ");
		}
	}
}