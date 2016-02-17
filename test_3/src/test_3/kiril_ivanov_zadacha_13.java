package test_3;

import java.util.Scanner;

public class kiril_ivanov_zadacha_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number for Sum, between 2 and 27: ");
		int sum = sc.nextInt();
		if ((sum < 2) || (sum > 27)) {
			System.out.println("Invalid imput!");
		}
		int tricifreni = 100;
		int ticifreni1 = tricifreni;
		int cifri = 0;
		int sborTri = 0;
		while (tricifreni <= 999) {
			while (ticifreni1 > 0) {
				cifri = ticifreni1 % 10;
				ticifreni1 = ticifreni1 / 10;
				sborTri = sborTri + cifri;
				if ((sborTri == sum) && (ticifreni1 == 0)) {
					System.out.print(tricifreni + ", ");
				}
			}
			tricifreni++;
			ticifreni1 = tricifreni;
			sborTri = 0;
		}
	}
}