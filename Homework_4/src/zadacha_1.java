import java.util.Scanner;

public class zadacha_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] doubleArray = { { 3, 4, -1, 51, 22 }, 
				{ 43, 41, 12, 35, 62, 16 }, 
				{ -3, 24, 91, -155, -12 },
				{ 23, -24, 73, 520, 24 },
				{ 11, 23, -54, 76, 6640 }, 
				{ 32, 67, 1332, 579, 128 }};

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int row=0; row < doubleArray.length; row++) {
			for (int col=0; col < doubleArray[row].length; col++) {
				
				if (doubleArray[row][col] < min) {
					min = doubleArray[row][col];
				}
				
				if (doubleArray[row][col] > max) {
					max = doubleArray[row][col];
				}
			}
		}
		System.out.println("The minimum value is: " + min);
		System.out.println("The maximum value is: " + max);
	}
}