package test_2;

import java.util.Scanner;

public class kiril_ivanov_zadacha_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the depth of the tank in liters: ");
		int depth = sc.nextInt();

		int bothBuckts = depth / 5;
		int leftLiters = depth % 5;

		if (leftLiters == 1) {
		System.out.println( (bothBuckts - 1) + " buckets of 2 liters and " + (bothBuckts + 1) + " buckets of 3 liters." );
		} 

		if (leftLiters == 2) {
		System.out.println( (bothBuckts + 1) + " buckets of 2 liters and " + bothBuckts + " buckets of 3 liters." );
		}

		if (leftLiters == 3) {
		System.out.println( bothBuckts + " buckets of 2 liters and " + (bothBuckts + 1) + " buckets of 3 liters." );
		}

		if (leftLiters == 4) {
		System.out.println( (bothBuckts + 2) + " buckets of 2 liters and " + bothBuckts + " buckets of 3 liters." );
		}
		if (leftLiters == 0) {
			System.out.println( (bothBuckts) + " buckets of 2 liters and " + bothBuckts + " buckets of 3 liters." );
		}
	}
}