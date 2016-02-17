package test_3;

import java.util.Scanner;

public class kiril_ivanov_zadacha_20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int j = 0;
		  
		  for(int i = 1; i <= 100; i++) {
		   
		   int number = ((i - 1  + j) % 10);
		   System.out.print(number + " ");
		   
		   if (i % 10 == 0) {
		    j++;
		    System.out.println("");
		   }
		  }
	}
}