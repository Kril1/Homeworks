package test_4;

import java.util.Scanner;

public class zadacha_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the lenght of the array: ");
	
		int lenght0 = sc.nextInt ();
		int[] array = new int [lenght0];
		
		int max = 0;
		int maxElement = 0;
		int count = 1;
		
		System.out.print("Enter the numbers for the array:");
		for (int index = 0; index < array.length; index ++){
			array[index] = sc.nextInt();
		}
		
		for (int index=0; index<array.length-1; index++) {
			count = 1;
			
			for (int index2=index+1; index2 < array.length; index2++) {
				if (array[index2] != array[index]) {
					break;
					
				}else {
					count++;
				}
			}
			
			if (count > max) {
				max = count;
				maxElement = array[index];
			}
		}
		if (max == 1){
			System.out.println("There are no duplicate elements in the array");
		}else{
		System.out.println("The max element is : " + maxElement + "(" + max + ")");
		}
	}
}