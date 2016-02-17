import java.util.Scanner;

public class Strings_zadacha_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a word: ");
		String wordOne = sc.next();

		System.out.println("Enter a second word: ");
		String wordTwo = sc.next();

		int letterFromFirst = 0;
		int letterFromSecond = 0;

		boolean sameLetter = false;

		for (int index = 0; index < wordOne.length(); index++) {

			for (int index1 = 0; index1 < wordTwo.length(); index1++) {

				if (wordOne.charAt(index) == wordTwo.charAt(index1)) {
					letterFromFirst = index;
					letterFromSecond = index1;
					sameLetter = true;
					break;
				}
			}
		}
		if (sameLetter == false) {
			System.out.println("There are letters that are the same in the two words!");
		}

		for (int index = 0; index < wordOne.length(); index++) {

			if (index == letterFromFirst) {
				System.out.println(wordTwo);
			} else {

				for (int space = 0; space < letterFromSecond; space++) {
					System.out.print(" ");
				}
				System.out.print(wordOne.charAt(index));
				System.out.println("");
			}
		}

	}
}