import java.util.Arrays;
import java.util.Scanner;

public class selection_sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 1, 4, 67, 8, 43, 1, 58, 4, 3, 46, 78, 7, 6, 3, 34 };

		int start = 0;

		for (int end = arr.length - 1; end >= start; end--) {
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			int maxIndex = 0;
			int minIndex = 0;
			
			for (int index = start; index < end; index++) {
				if (arr[index] > max) {
					max = arr[index];
					maxIndex = index;
				}
				if (arr[index] < min) {
					min = arr[index];
					minIndex = index;
				}
			}
			int temp = arr[maxIndex];
			arr[maxIndex] = arr[end];
			arr[end] = temp;

			int temp2 = arr[minIndex];
			arr[minIndex] = arr[start];
			arr[start] = temp2;
			start++;

		}
		System.out.println(Arrays.toString(arr));
	}
}