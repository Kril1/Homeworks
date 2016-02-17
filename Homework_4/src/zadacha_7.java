public class zadacha_7 {

	public static void main(String[] args) {
		int[][] numbersArray = { 
				{ 11, 12, 13, 14, 15, 16 }, 
				{ 21, 22, 23, 24, 25, 26 }, 
				{ 33, 34, 31, 32, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, 
				{ 51, 52, 53, 54, 55, 56 }, 
				{ 61, 62, 63, 64, 65, 66 } 
				};
		
		//my life was pretty good before I started working on this problem

		int firstIndex = 0;
		int secondIndex = 0;
		int totalSum = 0;
		int sumRow = 0;

		for (int i = 1; i <= 36; i++) { //took me more than 1 hour to figure this out
			int currentNumber = numbersArray[firstIndex][secondIndex];
						
			if ((firstIndex + secondIndex) % 2 == 0 ){
				System.out.print(numbersArray[firstIndex][secondIndex] + ", ");
				sumRow += numbersArray[firstIndex][secondIndex];
				
			}
			
			secondIndex++;

			if (i % 6 == 0) {
				System.out.print("the sum of the elements on this row is " + sumRow);
				totalSum += sumRow;
				firstIndex++;
				secondIndex = 0;
				sumRow = 0;
				System.out.println();
			}
	}
		System.out.println("Total sum of all elementes is: " + totalSum);
	}
}