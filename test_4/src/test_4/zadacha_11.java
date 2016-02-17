package test_4;

import java.util.Scanner;

public class zadacha_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number for the length of the array: ");
		int length0 = sc.nextInt();
		
		int [] array = new int[length0];
		int howManyNumbers = 0;
		
		System.out.print("Enter the numbers for the array: ");
		
		for (int index =0; index < array.length; index ++){
			array[index] = sc.nextInt();
		}
	
		
		for (int index = 0; index <array.length; index ++){
			if ((array[index]>5)&&(array[index]%5==0)){
				howManyNumbers ++;
				System.out.print(array[index] + ", ");
			}
		}
		if((howManyNumbers > 1) || (howManyNumbers ==0)){
		System.out.print(howManyNumbers + " numbers");
	}else{
		System.out.println("1 number");
	}
}
}