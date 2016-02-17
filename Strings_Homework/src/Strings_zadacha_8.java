import java.util.Scanner;

public class Strings_zadacha_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a sentence: ");
		String pali = sc.nextLine();
		int bacwards = pali.length() - 1;
		boolean palindrome = true;

		for (int index = 0; index < pali.length() / 2; index++) {
			if (pali.charAt(index) != pali.charAt(bacwards)) {
				System.out.println("Not a palindrome!");
				palindrome = false;
				break;
			}
			bacwards--;
		}

		if (palindrome == true) {
			System.out.println("It's a palindrome!");
		}

	}
}