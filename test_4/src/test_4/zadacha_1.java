package test_4;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class zadacha_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];

		for (int index = 0; index < array.length; index++) {
			array[index] = sc.nextInt();
		}

		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < array.length; i++) {

			if ((array[i] % 3 == 0) && (array[i] < min)) {
				min = array[i];
			}
		}
		if ((min % 3 == 0) && (min != Integer.MAX_VALUE)){ 
		System.out.println("The minimum element that is devideble by 3 is :" + min);
		}else{
			System.out.println("There is no element in the array that is devideble by 3!");
		}
	}
}