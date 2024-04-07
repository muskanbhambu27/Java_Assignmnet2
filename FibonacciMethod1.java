/*Question Number 1 
 *Method (a)  */
package AssIgn2;

import java.util.Scanner;

public class FibonacciMethod1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of terms : ");
		int n = scanner.nextInt();

		int a = 0, b = 1, c;
		System.out.print("Fibonacci Series :  " + a + " " + b + " ");

		for (int i = 0; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(c + " ");
		}
	}
}
