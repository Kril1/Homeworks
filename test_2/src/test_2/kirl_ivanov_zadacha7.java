package test_2;

import java.util.Scanner;

public class kirl_ivanov_zadacha7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an hour = ");
		int chas = sc.nextInt();
		System.out.println("Enter amount of money = ");
		double money = sc.nextDouble();
		System.out.println("Are you sick?");
		boolean sick = sc.nextBoolean();
		if (sick == true) {
			System.out.println("I won't go out!");
			if (money > 0) {
				System.out.println("I will buy drugs.");
			} else {
				System.out.println("I will stay home and drink tea!");
			}
		}
		if (sick == false){
			if (money > 10){
				System.out.println("Will go to the cinema with friends!");
			} else {
				System.out.println("Will go to the coffee shop!");
			}
		}
	}
}