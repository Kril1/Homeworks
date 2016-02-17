import java.util.Scanner;

public class Strings_zadacha_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the first string: ");
		String randomString = sc.nextLine();
		System.out.println("Plese enter the second struing: ");
		String randomString1 = sc.nextLine();
		
		String UpperRandomString = randomString.toUpperCase();
		String LowerRandomString = randomString.toLowerCase();
		System.out.print(UpperRandomString + " " + LowerRandomString);
		
		String UpperRandomString1 = randomString1.toUpperCase();
		String LowerRandomString1 = randomString1.toLowerCase();
		System.out.print(" " + UpperRandomString1 + " " + LowerRandomString1);
	}
}
