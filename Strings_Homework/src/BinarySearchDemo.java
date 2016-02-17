
public class BinarySearchDemo {

	static int binarySearch(int a[], int x) {
		int l = 0;
		int r = a.length - 1;

		while (l <= r) {
			int m = (l + r) / 2;

			if (a[m] == x) {
				return m;
			}

			if (a[m] > x) {
				r = m - 1;
			}

			if (a[m] < x) {
				l = m + 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		System.out.println(
				binarySearch(new int[] { 1, 3, 5, 6, 8, 10, 11, 18, 50, 70, 90, 100, 300 }, 5));
		int [] arr = {1,4,6,8,2,4};
	
	for (int i = 0; i < arr.length; i++){
		for (int index = 1 + i; index <arr.length; index++){
			if (arr[i] + arr[index] == 11){
				System.out.println( i + index + " = 11");
			}
		}
	}
	
	
	}
}