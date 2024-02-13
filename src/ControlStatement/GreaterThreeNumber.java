package ControlStatement;

import java.util.Scanner;

public class GreaterThreeNumber {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int a=sc.nextInt();
		System.out.println("Enter 2nd number:");
		int b=sc.nextInt();
		System.out.println("Enter 3rd number:");
		int c=sc.nextInt();
		
		if(a>b) {
			if(a>c) {
				System.out.println("Enter A Greatest number:"+ a);
				
			}
			else {
				System.out.println("Enter C Greatest number 11:" + c);
			}
		}
		else if(b>c) {
			System.out.println("Enter B Greatest number:" + b);
			
		}
		else {
			System.out.println("Enter C Greatest number:" + c);
		}
		
		
	}

}
