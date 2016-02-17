package test_2;

import java.util.Scanner;

public class kiril_ivanov_zdacha2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Numbers without decimals
		System.out.println("Enter a number x=");
		int x = sc.nextInt();
		System.out.println("Enter a number y=");
		int y = sc.nextInt();
		int z = x + y;
		int a = x - y;
		int b = x * y;
		int c = x / y;
		int d = x % y;
		System.out.println("z=x+y=" + z);
		System.out.println("a=x-y=" + a);
		System.out.println("b=x*y=" + b);
		System.out.println("c=x/y=" + c);
		System.out.println("d=x%y=" + d);
	
		// Numbers with decimals
				System.out.println("Enter a number e=");
				double e = sc.nextDouble();
				System.out.println("Enter a number f=");
				double f = sc.nextDouble();
				double g = x + y;
				double h = x - y;
				double i = x * y;
				double j = x / y;
				double k = x % y;
				System.out.println("g=x+y=" + g);
				System.out.println("h=x-y=" + h);
				System.out.println("i=x*y=" + i);
				System.out.println("j=x/y=" + j);
				System.out.println("k=x%y=" + k);
				
	}
}
