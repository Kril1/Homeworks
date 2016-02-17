import java.util.Scanner;

public class Strings_zadacha_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a sentence: ");
		String sentence = sc.nextLine();
		char space = ' ';
		int howManyWords = 1;
		int longestWord = 0;
		int symbols = 0;
		
		for (int index = 0; index < sentence.length(); index++) {

			if (sentence.charAt(index) == space) {
				howManyWords++;
				symbols = 0;
			}
			if(sentence.charAt(index) != space) {
				symbols ++;
			}
			if (symbols > longestWord){
				longestWord = symbols;
			}
			
		}
		System.out.println(howManyWords + " words, the longset one is " + longestWord + "symbols");
	}
}