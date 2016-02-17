package test_3;

import java.util.Scanner;

public class kiril_ivanov_zadacha_21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 51:");
		int a = sc.nextInt();

		for (int card = a; card <= 52; card++) {
			int cardNumber = (card - 1) / 4;
			int cardSuit = card % 4;
			switch (cardNumber) {
			
			case 0:System.out.print("The Two");break;
			case 1:System.out.print("The Three");break;
			case 2:System.out.print("The Four");break;
			case 3:System.out.print("The Five");break;
			case 4:System.out.print("The Six");break;
			case 5:System.out.print("The Seven");break;
			case 6:System.out.print("The Eight");break;
			case 7:System.out.print("The Nine");break;
			case 8:System.out.print("The Ten");break;
			case 9:System.out.print("The Jack");break;
			case 10:System.out.print("The Queen");break;
			case 11:System.out.print("The King");break;
			case 12:System.out.print("The Ace");break;
			}
			
			System.out.print(" ");
			
			switch (cardSuit) {
			case 1:System.out.print("of Clubs");break;
			case 2:System.out.print("of Diamonds");break;
			case 3:System.out.print("of Hearts");break;
			case 0:System.out.print("of Spades");break;
			}
			
			if (card < 52) {
				System.out.print(", ");
			}
		}
	}
}