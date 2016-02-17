import java.util.Scanner;

public class Strings_zadacha_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 2 words, that are at least 5 letters long: ");
		String firstWord = sc.next();
		String secondWord = sc.next();
		String bigsetWord = firstWord;
		String smallerWord = secondWord;
		String newWord = "";

		if ((firstWord.length() < 5) || (secondWord.length() < 5)) {
			System.out.println("Invalid imput!");
		}

		if (firstWord.length() < secondWord.length()) { // In the case they are
														// equal, it will take
														// the first word.
			bigsetWord = secondWord;
			smallerWord = firstWord;
		}

		for (int symbol = 0; symbol < bigsetWord.length(); symbol++) {
			if (symbol <= 4) {
				newWord += smallerWord.charAt(symbol);
			}
			if (symbol > 4){
				newWord += bigsetWord.charAt(symbol);
			}
		}

		System.out.println(bigsetWord.length() + " " + newWord);
	}

}