import java.util.Scanner;

public class Strings_zadacha_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 2 words, that are the same length: ");
		String firstWord = sc.next();
		String secondWord = sc.next();

		if (firstWord.length() != secondWord.length()) {
			System.out.println("Invalid imput");
		}

		for (int index = 0; index < firstWord.length(); index++) {
			if (firstWord.charAt(index) != secondWord.charAt(index)) {
				System.out.println((index + 1) + " " + firstWord.charAt(index) + "-" + secondWord.charAt(index));
			}
		}
	}
}