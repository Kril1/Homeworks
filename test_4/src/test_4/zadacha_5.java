package test_4;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class zadacha_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[10];
	
		for (int index = 0; index < array.length; index++) {
			array[index] = index *3;
			System.out.print(array[index] + " ");
		}
	}
}