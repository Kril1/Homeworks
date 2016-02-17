import java.util.Scanner;

public class zadacha_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] array = { 
				{ 11, 12, 13, 14, 15, 16 }, 
				{ 21, 22, 23, 24, 25, 26 }, 
				{ 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, 
				{ 51, 52, 53, 54, 55, 56 }, 
				{ 61, 62, 63, 64, 65, 66 } 
				};

		int totalSum = 0;
		int evenRow = 1;
		
		for (int row = 0; row < array.length; row++) {
			
			int sumOfRow = 0;
		
			if (evenRow % 2 ==0){
				for (int col = 0; col < array[row].length; col ++){
					sumOfRow += array[row][col];
					System.out.print(array[row][col] + " ");
				}
				System.out.print("total is " + sumOfRow);
				System.out.println("");
			}
			evenRow ++;
			totalSum += sumOfRow;
		}System.out.println("The total of the elements is: " + totalSum);
	}
}
