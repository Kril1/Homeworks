package test_4;

public class zadacha_18 {
	public static void main(String[] args) {
		int[] numbers_array = {141, 1548,1,528,-1696,57,14,75,785,999,354 };

		int first = Integer.MIN_VALUE;
		int second_max = Integer.MIN_VALUE;
		int third_max = Integer.MIN_VALUE;

		for (int i = 0; i < numbers_array.length; i++){
			 int current_number = Math.abs(numbers_array[i]);

			if (current_number >= first) {
				third_max = second_max;
				second_max = first;
				first = current_number;
			} else if (current_number >= second_max) {
				third_max = second_max;
				second_max = current_number;
			} else if (current_number >= third_max) {
				third_max = current_number;
			}
		}

		System.out.println(first);
		System.out.println(second_max);
		System.out.println(third_max);
	}
}