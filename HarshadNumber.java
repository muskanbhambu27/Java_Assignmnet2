// Question Number2 
package AssIgn2;

import java.util.Scanner;

public class HarshadNumber {
	public static void main(String[] args) {
		int num;
		int rem = 0, sum = 0, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Eter the Numbers : ");
		num = sc.nextInt();
		
		
		n = num;

		while (num > 0) {
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}

		if (n % sum == 0)
			System.out.println(n + " is  harshad number");
		else
			System.out.println(n + " is not a harshad number");
	}
}
