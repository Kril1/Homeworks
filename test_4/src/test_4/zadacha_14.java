package test_4;

import java.util.Scanner;

public class zadacha_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double [] array = {7.1,8.5,0.2,3.7,0.99,1.4,-3.5,-110,212,341,1.2};
		double [] smallerArray = new double [array.length];
		int length0 = 0;
		
		for (int index = 0; index < array.length; index ++){
			if ((array[index] > -2.99)&& (array[index]< 2.99)){
				smallerArray[length0] = array[index];
				length0 ++;
				
			}
		}
		
		for (int index = 0; index < length0; index ++){
			System.out.print(smallerArray[index] + ", ");
		}
	}
}