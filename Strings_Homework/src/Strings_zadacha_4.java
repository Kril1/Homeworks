import java.util.Scanner;

public class Strings_zadacha_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two full names: ");
		String nameOne = sc.nextLine();
		String nameTwo = sc.nextLine();
		int nameOneASK = 0;
		int nameTwoASK = 0;

		for (int index = 0; index < nameOne.length(); index++) {
			nameOneASK += nameOne.charAt(index);
		}
		for (int index = 0; index < nameTwo.length(); index++) {
			nameTwoASK += nameTwo.charAt(index);
		}
		if (nameOneASK > nameTwoASK) {
			System.out.println(nameOne);
		}
		if (nameOneASK < nameTwoASK) {
			System.out.println(nameTwo);
		}
		if (nameOneASK == nameTwoASK) {
			System.out.println("They are equal");
		}
	}
}