package test_3;

import java.util.Scanner;

public class kiril_ivanov_zadacha_24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number N: ");
		int pali1 = sc.nextInt();
		int pali = pali1;
		int ilap = 0;  	//Opposite of pali :D, get it, because they are palindromes, I amuse myself.
		do {
			int chisla = pali1 % 10;
			pali1 = pali1 / 10;
			ilap = ((ilap * 10) + chisla);		
		} while (pali1> 0);
		if (pali == ilap){
			System.out.println("The number is a palndrome!");
		}else {
			System.out.println("The number is not a palndrome!");
		}
	}
}