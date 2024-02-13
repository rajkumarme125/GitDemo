package ControlStatement;

import java.util.Scanner;

public class FactorialRecuession {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Numer to generate a factorial");
		int a = sc.nextInt();
		int factorial = calfact(a);

		System.out.println("factorial of " + a + " is: " + factorial);
	}

	public static int calfact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * calfact(n - 1);
		}

	}

}
