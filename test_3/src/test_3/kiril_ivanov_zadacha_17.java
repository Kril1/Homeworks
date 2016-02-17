package test_3;

import java.util.Scanner;

public class kiril_ivanov_zadacha_17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter lenght b= ");
		int lenght = sc.nextInt();

		System.out.println("Enter symbol c= ");
		char symbol = sc.next().charAt(0);

		for (int row = 1; row <= lenght; row++) {
			
			for (int column = 1; column <= lenght; column++) {
				
				if ((column == 1) || (column == lenght)) {
					System.out.print("*");
				} 
				else {
					if ((row == 1) || (row == lenght)) {
						System.out.print("*");
					} 
					else {
						System.out.print(symbol);
					}
				}
			}
			System.out.println("");
		}
	}
}