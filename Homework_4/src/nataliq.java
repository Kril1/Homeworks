import java.util.Scanner;

public class nataliq {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int lenghtO = sc.nextInt();

		int[][] arr = new int[lenghtO][lenghtO];

		for (int row1 = 0; row1 < arr.length; row1++) {

			for (int col1 = 0; col1 < arr[row1].length; col1++) {
				System.out.print(arr[row1][(col1 - 1) + (arr.length - 1) - row1] + " ");
				break;
			}
		}
	}

}
