package test_4;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class zadacha_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the lenght of the array: ");
		
		int lenghtO = sc.nextInt();
		int[] array = new int[lenghtO];
		
		boolean mirrored = true;
		
		int backwards = array.length -1 ;
		
		System.out.println("");
		System.out.print("Enter numbers in the array: ");
		
		for (int index = 0; index < array.length; index++) {
			array[index] = sc.nextInt();
		}
	
		for (int index = 0; index < array.length; index++) {
			if (array[backwards] != array[index]) {
				mirrored = false;
				break;
			}
			backwards --;
		}
		if (mirrored = true){
			System.out.println("The array is mirrored!");
		}else{
			System.out.println("The array is not mirrored!");
		}
		
	}
}