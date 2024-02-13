package ControlStatement;

import java.util.Scanner;

public class Calculator {
	public static void main(String [] args) {
		
		String yes;
		
		do {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter First Numer");
			int a = sc.nextInt();
			System.out.println("Enter Second Numer");
			int b = sc.nextInt();
			System.out.println("Enter symbol to perform calculation + - % / *");
			String symbol=sc.next();
			int result;
			
			switch(symbol){
			
			case "+" : 
				result =a+b;
				System.out.println("Summation of the number is: " + result);
				break;
			
			case "-" :
				result =a-b;
				System.out.println("Subtraction of the number is: " + result);
				break;
			case "/" :
				result =a/b;
				System.out.println("Division of the number is: " + result);
				break;
			case "%" :
				result =a%b;
				System.out.println("Modulas of the number is: " + result);
				break;
			case "*" :
				result =a*b;
				System.out.println("Multiplication of the number is: " + result);
				break;
			default:
				System.out.println("Entered Wrong symbol to perform calculation");
			
				
			}
			System.out.println("Do you want to continue: Enter y for yes and N for no");
			yes=sc.next();
		
			
		}
		
		while(yes.equalsIgnoreCase("Y"));
		
		}

}
