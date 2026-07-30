package BinartSearch;

public class BinarySearchBasics {

	public static void main(String[] args) {

		// Program 1 : Binary Search

		int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
		int target = 10;

		int start = 0;
		int end = arr.length - 1;
		int ans = -1;

		while (start <= end) {

			int mid = (start + end) / 2;

			if (arr[mid] == target) {
				ans = mid;
				break;
			}

			else if (arr[mid] < target) {
				start = mid + 1;
			}

			else {
				end = mid - 1;
			}
		}

		System.out.println("Binary Search = " + ans);

		System.out.println("\n==========================\n");

		// Program 2 : Search Insert Position

		int arr2[] = { 1, 3, 5, 6 };
		int x = 2;

		start = 0;
		end = arr2.length - 1;

		int position = arr2.length;

		while (start <= end) {

			int mid = (start + end) / 2;

			if (arr2[mid] >= x) {
				position = mid;
				end = mid - 1;
			}

			else {
				start = mid + 1;
			}
		}

		System.out.println("Insert Position = " + position);

		System.out.println("\n==========================\n");

		// Program 3 : First Occurrence

		int arr3[] = { 2, 4, 4, 4, 6, 8 };
		int key = 4;

		start = 0;
		end = arr3.length - 1;

		int first = -1;

		while (start <= end) {

			int mid = (start + end) / 2;

			if (arr3[mid] == key) {
				first = mid;
				end = mid - 1;
			}

			else if (arr3[mid] < key) {
				start = mid + 1;
			}

			else {
				end = mid - 1;
			}
		}

		System.out.println("First Occurrence = " + first);

		System.out.println("\n==========================\n");

		// Program 4 : Last Occurrence

		start = 0;
		end = arr3.length - 1;

		int last = -1;

		while (start <= end) {

			int mid = (start + end) / 2;

			if (arr3[mid] == key) {
				last = mid;
				start = mid + 1;
			}

			else if (arr3[mid] < key) {
				start = mid + 1;
			}

			else {
				end = mid - 1;
			}
		}

		System.out.println("Last Occurrence = " + last);

		System.out.println("\n==========================\n");

		// Program 5 : Peak Element

		int arr4[] = { 1, 3, 8, 12, 9, 5, 2 };

		start = 0;
		end = arr4.length - 1;

		while (start < end) {

			int mid = (start + end) / 2;

			if (arr4[mid] < arr4[mid + 1]) {
				start = mid + 1;
			}

			else {
				end = mid;
			}
		}

		System.out.println("Peak Index = " + start);
		System.out.println("Peak Element = " + arr4[start]);

		System.out.println("\n==========================\n");

		// Program 6 : Single Element in Sorted Array

		int arr5[] = { 1, 1, 2, 2, 3, 4, 4, 5, 5 };

		start = 0;
		end = arr5.length - 1;

		while (start < end) {

			int mid = (start + end) / 2;

			if (mid % 2 == 1) {
				mid--;
			}

			if (arr5[mid] == arr5[mid + 1]) {
				start = mid + 2;
			}

			else {
				end = mid;
			}
		}

		System.out.println("Single Element = " + arr5[start]);

		System.out.println("\n==========================");

		// Program 7 : Square Root

		int n = 28;

		start = 1;
		end = n;

		int sqrt = 0;

		while (start <= end) {

			int mid = (start + end) / 2;

			if ((long) mid * mid <= n) {
				sqrt = mid;
				start = mid + 1;
			}

			else {
				end = mid - 1;
			}
		}

		System.out.println("Square Root = " + sqrt);

	}

}