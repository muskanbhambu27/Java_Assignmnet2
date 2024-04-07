package AssIgn2;
//Question Number 5
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, a, count = 0, count1 = 0;
		

		System.out.println("Enter the value of n :");
		n = sc.nextInt();

		for (a = 1; a <= n; a = a + 2) {
			System.out.println("odd numbers :" + a);
			count++;

		}
		System.out.println("total odd number :" + count);
		for (a = 2; a <= n; a = a + 2) {
			System.out.println("Even numbers :" + a);
			count1++;

		}
		System.out.println("total Even number :" + count1);
	}

}
