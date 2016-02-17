import java.util.Scanner;

public class zadacha_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int lenghtO = sc.nextInt();

		int[][] doubleArray = new int[lenghtO][lenghtO];

		for (int col = 0; col < doubleArray.length; col++) {
			for (int row = 0; row < doubleArray[col].length; row++) {
				doubleArray[col][row] = sc.nextInt();
			}

		}
		for (int col = 0; col < doubleArray.length; col++) {
			System.out.print(doubleArray[col][col] + " ");
		}
		System.out.println();

		for (int col = 0; col < doubleArray.length; col++) {
			System.out.print(doubleArray[col][doubleArray.length- col - 1 ] + " ");
		}
		System.out.println();
	}
}