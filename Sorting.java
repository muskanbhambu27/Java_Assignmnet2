package AssIgn2;
//Question Number 4
import java.util.*;

public class Sorting{

	static void printOrder(int[] arr, int n) {

		Arrays.sort(arr);

		for (int i = 0; i < n / 2; i++)
			System.out.print(arr[i] + " ");

		for (int j = n - 1; j >= n / 2; j--)
			System.out.print(arr[j] + " ");

	}

	public static void main(String[] args) {
		int[] arr = { 1, 90, 34, 89, 7, 9 };
		int n = arr.length;
		System.out.println("AScending Array :");
	printOrder(arr, n);

	}
}
