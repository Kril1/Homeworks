import java.util.Scanner;

public class zadacha_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ctrl + shif + F orders them like that, too lazy to fix, sorry.
		
		int[][] array = { { 1, 28, 3, 45 }, { 5, 6, 7, 88 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		int mejdinenSborColoni = 0;
		int maxSborColoni = 0;

		for (int col = 0; col < array.length; col++) {
			for (int row = 0; row < array[col].length; row++) {
				mejdinenSborColoni = mejdinenSborColoni + array[row][col];

				if (mejdinenSborColoni > maxSborColoni) {
					maxSborColoni = mejdinenSborColoni;
				}
			}
			mejdinenSborColoni = 0;
		}
		System.out.println("The maxium sum of the numbers in the columns is: " + maxSborColoni);

		int mejdinenSborRed = 0;
		int maxSborRed = 0;

		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				mejdinenSborRed = mejdinenSborRed + array[row][col];

				if (mejdinenSborRed > maxSborRed) {
					maxSborRed = mejdinenSborRed;
				}
			}
			mejdinenSborRed = 0;
		}
		System.out.println("The maxium sum of the numbers in the rows is: " + maxSborRed);
		
		if (maxSborRed > maxSborColoni){
			System.out.println("The maxium sum of the rows is > than the maxium sum of the columns");
		}else{
			System.out.println("The maxium sum of the columns is > than the maxium sum of the rows");
		}
		
	}
}
