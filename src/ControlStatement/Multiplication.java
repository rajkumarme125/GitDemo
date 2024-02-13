package ControlStatement;

import java.util.Scanner;

public class Multiplication {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Numer to generate a table");
		int a = sc.nextInt();
		System.out.println("Table of "+ a +" is:");
		System.out.println(" ");
		
		for(int i=1;i<=10;i++) {
			System.out.println(a +" * "+ i+ " = "+ a*i);
			
			
		}
	}

}
