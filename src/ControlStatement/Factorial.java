package ControlStatement;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Numer to generate a factorial");
		int a = sc.nextInt();
		
		int f=1;

		for (int i = 1; i <=a; i++) {
			f=f*i;

		}
		System.out.println("factorial of " + a + " is: "+ f);
		

	}

}
