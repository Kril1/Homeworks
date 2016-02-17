package test_2;
import java.util.Scanner;
public class zadacha1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number A=");
		double A = sc.nextDouble();
		System.out.println("Enter a number B=");
		double B = sc.nextDouble();
		System.out.println("Enter a number C=");
		double C = sc.nextDouble();
		if ((A < C) && (C < B)){
			System.out.println("The number " + C + " is between " + A + " and " + B);
		}
		else {
			System.out.println("The number " + C + " is not between " + A + " and " + B );
		}
	}

}
