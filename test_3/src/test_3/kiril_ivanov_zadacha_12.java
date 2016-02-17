package test_3;

import java.util.Scanner;

public class kiril_ivanov_zadacha_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numbers = 100;
		for (int lastNumber = 999; numbers <= lastNumber; numbers++){
			int lastDigit = numbers % 10;
			int secondDigit = numbers;
			secondDigit = ((numbers / 10) % 10);
			int firstDigit = numbers;
			firstDigit = ((firstDigit / 100) % 10);
			if ((lastDigit != secondDigit) && (secondDigit != firstDigit) && (lastDigit != firstDigit)){
				System.out.println(numbers);
			}
		}
	}
}