package test_2;

import java.util.Scanner;

public class kiril_ivanov_zadacha14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first coodinates for the first square: ");
		int firstCoo = sc.nextInt();
		System.out.println("Enter second coodinates for the fist square: ");
		int secondCoo = sc.nextInt();
		System.out.println("Enter first coodinates for the second square: ");
		int thirdCoo = sc.nextInt();
		System.out.println("Enter second coodinates for the second square: ");
		int fourthCoo = sc.nextInt();
		boolean firstSQ = true;
		boolean secondSQ = false;
		if ((firstCoo % 2 == 0) && (secondCoo % 2 == 0) || (firstCoo % 2 != 0) && (secondCoo % 2 != 0)) {
			firstSQ = false;
		}
		if ((thirdCoo % 2 == 0) && (fourthCoo % 2 != 0) || (thirdCoo % 2 != 0) && (fourthCoo % 2 == 0)) {
			secondSQ = true;
		}
		if ((firstSQ == true && secondSQ == true) || (firstSQ == false && secondSQ == false)) {
			System.out.println("The two squares are the same collor!");
		} else {
			System.out.println("The two squares are not the same coolor!");
		}
	}
}
