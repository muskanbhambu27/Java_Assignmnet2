//Question Number 3
package AssIgn2;

public class FactoriaL {

	public static int fact(int n) {
		if (n == 0)
			return 1;
		return n * fact(n - 1);
	}

	public static void main(String[] args) {
		int n = 5;

		int result = fact(n);
		System.out.println("Factorial of " + n + " is: " + result);
	}
}
