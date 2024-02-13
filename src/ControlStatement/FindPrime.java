package ControlStatement;

import java.util.Scanner;

public class FindPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Start number to check prime in between");
		int num1 = sc.nextInt();
		System.out.println("Enter End number to check prime in between");
		int num2 = sc.nextInt();
		System.out.println("Prime Numbers in between "+num1+ " and "+num2);
		for(int i=num1;i<=num2;i++) {	
			int count = 0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count=count+1;
					
				}
			}
			if(count<=2) {
				System.out.println(i+" is a Prime Number ");
				
			}

		}
		

	}

}
