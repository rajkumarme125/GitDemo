package ControlStatement;

import java.util.Scanner;

public class Armstrong {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it is an Armstrong number:");
        int number = scanner.nextInt();
        isArmstrong(number) ;
        

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        scanner.close();
		
	}
	public static boolean isArmstrong(int num) {
		 int originalNum, remainder, result = 0, n = 0,arm=0;
	        originalNum = num;
	        while(originalNum!=0) {
	        	originalNum=originalNum/10;
	        	n++;
	        	
	        }
	        
	        originalNum = num;
	        
	        
	        while(originalNum!=0) {
	        	
	        	remainder=originalNum % 10;
	        	originalNum=originalNum/10;
//	        	System.out.println("remainder:"+remainder);
	        	int multi=1;
	        	for(int i=1;i<=n;i++) {
//	        		System.out.println("n:"+n);
	        		multi=multi*remainder;
	        		
	        	}
	        	arm=arm+multi;
//	        	System.out.println("multi:"+ multi);
//	        	System.out.println("arm:"+arm);
	        	
//	        	
	        	
	        	
	        }
//	        System.out.println("arm:"+arm);
	        return num == arm;
	        
		
		
	}


}
