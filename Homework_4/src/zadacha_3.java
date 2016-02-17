public class zadacha_3 {

	public static void main(String[] args) {
		int[][] numbersArray = { 
				{ 11, 12, 13, 14, 15, 16, 17}, 
				{ 21, 22, 23, 24, 25, 26,27,28 }, 
				{ 33, 34, 31, 32, 35, 36 },
				{ 41, 42, 43, 44, 45, 46,48 }, 
				{ 51, 52, 53, 54, 55, 56 }, };
		
		int numberOfElements = 0;
		int totalSumOfElements = 0;
		
		for (int row = 0; row < numbersArray.length; row ++){
			for (int col =0; col < numbersArray[row].length; col++){
				numberOfElements ++;
				totalSumOfElements += numbersArray[row][col];
			}
		}
		System.out.println("The total sum of all elements is: " + totalSumOfElements);
		System.out.println("The avarage number is: " + (totalSumOfElements / numberOfElements));
	}
}