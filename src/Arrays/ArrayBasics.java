
package Arrays;

import java.util.Scanner;

public class ArrayBasics {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] x = {4, 2, 6, 32, 64};

		int[] arr = new int[4];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		System.out.println("Length of array is : " + arr.length);

		System.out.println("Enter the length of array");
		int n = sc.nextInt();

		int[] brr = new int[n];

		System.out.println("Enter the elements");
		for (int i = 0; i < n; i++) {
			brr[i] = sc.nextInt();
		}

		System.out.println("Elements are");
		for (int i = 0; i < n; i++) {
			System.out.print(brr[i] + " ");
		}

		System.out.println();
		System.out.println("================ Sum of Elements ================");

		int[] a = {1, 2, 3, 4, 5, 6};
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}

		System.out.println("Sum is : " + sum);

		System.out.println();
		System.out.println("================ Maximum Element ================");

		int[] b = {1, 2, 89, 3, 4, 5, 6};
		int max = b[0];

		for (int i = 1; i < b.length; i++) {
			if (b[i] > max) {
				max = b[i];
			}
		}

		System.out.println("Maximum element is : " + max);

		System.out.println();
		System.out.println("================ Second Maximum ================");

		int[] c = {12, 45, 7, 89, 34};

		int first = c[0];
		int second = c[0];

		for (int i = 0; i < c.length; i++) {

			if (c[i] > first) {
				second = first;
				first = c[i];
			} else if (c[i] > second && c[i] != first) {
				second = c[i];
			}
		}

		System.out.println("Second maximum is : " + second);

		System.out.println();
		System.out.println("================ Passing Array to Method ================");

		int[] xx = {10, 20, 30, 40};

		change(xx);

		System.out.println(xx[2]);

		System.out.println();
		System.out.println("================ Linear Search ================");

		int target = 29;
		int[] d = {1, 23, 54, 29, 84};

		for (int i = 0; i < d.length; i++) {
			if (target == d[i]) {
				System.out.println("Element found at index : " + i);
			}
		}

		System.out.println();
		System.out.println("================ Pair Sum ================");

		int[] e = {1, 5, 8, -3};
		int sum1 = 2;

		for (int i = 0; i < e.length; i++) {
			for (int j = i + 1; j < e.length; j++) {

				if (e[i] + e[j] == sum1) {
					System.out.println("Pair is : " + e[i] + " " + e[j]);
				}
			}
		}

		System.out.println();
		System.out.println("================ Missing Number ================");

		int[] f = {1, 2, 4, 5};

		int s = 0;

		for (int i = 0; i < f.length; i++) {
			s = s + f[i];
		}

		int ans = (5 * 6) / 2 - s;

		System.out.println("Missing number is : " + ans);

		System.out.println();
		System.out.println("================ Reverse Array ================");

		int[] g = {7, 6, 90, 76, 34};

		int i = 0;
		int j = g.length - 1;

		while (i < j) {

			int temp = g[i];
			g[i] = g[j];
			g[j] = temp;

			i++;
			j--;
		}

		for (int ele : g) {
			System.out.print(ele + " ");
		}

		System.out.println();
		System.out.println("================ Rotate Array ================");

		int[] h = {1, 2, 3, 4, 5};

		int last = h[h.length - 1];

		for (int k = h.length - 1; k > 0; k--) {
			h[k] = h[k - 1];
		}

		h[0] = last;

		for (int ele : h) {
			System.out.print(ele + " ");
		}

		sc.close();
	}

	public static void change(int[] x) {
		x[2] = 40;
	}

}
