package AssIgn2;
//Question number 6
import java.util.Arrays;

public class LeftRight {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println("Original Array: " + Arrays.toString(arr));

		rightRotate(arr);
		System.out.println("Right Rotated Array: " + Arrays.toString(arr));

		leftRotate(arr);
		System.out.println("Left Rotated Array: " + Arrays.toString(arr));
	}

	public static void rightRotate(int[] arr) {
		if (arr.length <= 1)
			return;

		int last = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = last;
	}

	public static void leftRotate(int[] arr) {
		if (arr.length <= 1)
			return;

		int first = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = first;
	}
}
