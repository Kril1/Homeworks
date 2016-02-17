import java.util.Scanner;

public class zadacha_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] array = { 
				{ 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 }, 
				{ 13, 14, 15, 16 } 
				};

		for (int col =  0; col < array.length ; col++){
			for (int row =  array[col].length - 1; row >= 0; row --){
				System.out.print(array[row][col] + " ");
			}System.out.println("");
		}
	}
}
