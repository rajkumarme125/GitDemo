package ControlStatement;

import java.util.Scanner;

public class PrimeCheck {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number to check if it is prime or not");
		int num = sc.nextInt();
		int count = 0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count=count+1;
				if(count>2) {
					System.out.println("Entered number "+num+ " is not prime");
					break;
					
				}
				
			}
		}
		if (count<=2) {
			System.out.println("Entered number "+num+ " is prime");
		}
			
		

	}

}
