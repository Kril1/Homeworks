package test_4;

import java.util.Scanner;

public class zadacha_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int leftOvers = 0;
		int lenghtOfArray = 0;
		int desetichnoChislo = sc.nextInt();
		
		
		for (int badWayToDoStuff = desetichnoChislo; badWayToDoStuff >0; badWayToDoStuff= badWayToDoStuff/2 ){
			lenghtOfArray++;
		}
		
		int [] array = new int [lenghtOfArray];

		for (int index = 0; index< array.length; index++ ){
		
			leftOvers = desetichnoChislo % 2;
			
			desetichnoChislo = desetichnoChislo /2;
			
			array[(lenghtOfArray - 1) - index] = leftOvers; //This is the place I reverse the order.
			
		}
		for (int index = 0; index< array.length; index++ ){
			System.out.print(array[index]);
		}
	}
}