package test_3;

import java.util.Scanner;

public class kirl_ivanov_zadacha_23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 1;
		int y = 1;
		System.out.print("Row 1: ");
		while (x <= 10){
			System.out.print(x + "*" + y + " ");
			y++;
			if (y == 10){
				x ++;
				y = x;
				if(x == 10){
					break;
				}
			System.out.println(" ");
			System.out.print("Row " + x + ": ");	
				
			}
		}
	}
}