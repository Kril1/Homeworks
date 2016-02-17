import java.util.Scanner;

public class Strings_zadacha_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a sentence: ");
		String ascki = sc.nextLine();
		String newascki = "";

		for (int index = 0; index < ascki.length(); index++) {
			newascki += (char)(ascki.charAt(index)+ 5);
			
			
		}System.out.println(newascki);
	}
}