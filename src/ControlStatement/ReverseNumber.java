package ControlStatement;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Numer to reverse it");
		int a = sc.nextInt();
		int p=a;
		int rev=0;
		while (a!=0) {
			int n=a%10;
			rev=rev*10+n;
			a=a/10;
			
		}
		System.out.println("reverse of " + p + " is: " + rev);
				

	}

}
