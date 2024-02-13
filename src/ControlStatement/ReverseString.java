package ControlStatement;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String to reverse it");
		String a = sc.next();
		String p=a;
		String rev="";
		int len=a.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+a.charAt(i);
		}
		
		System.out.println("reverse of " + p + " is: " + rev);
				

	}

}

