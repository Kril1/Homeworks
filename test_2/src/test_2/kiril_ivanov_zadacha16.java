package test_2;

import java.util.Scanner;

public class kiril_ivanov_zadacha16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a three digit number: ");
		int threeDigit = sc.nextInt();
		int lastDigit = threeDigit % 10;
		int secondDigit = threeDigit;
		secondDigit = ((secondDigit / 10) % 10);
		int firstDigit = threeDigit;
		firstDigit = ((firstDigit / 100) % 10);
		boolean randomNumber = true;
		if ((firstDigit < secondDigit) && (secondDigit < lastDigit)) {
			System.out.println("The numbers are in ascending order");
			randomNumber = false;
		}
		if ((firstDigit > secondDigit) && (secondDigit > lastDigit)) {
			System.out.println("The numbers are in descending order");
			randomNumber = false;	
		}
		if ((firstDigit == secondDigit) && (secondDigit == lastDigit)) {
			System.out.println("The numbers are equal");
			randomNumber = false;		
		}
		if (randomNumber == true){
			System.out.println("The numbers aren't orderd");
		}
	}
}