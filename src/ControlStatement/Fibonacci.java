package ControlStatement;
import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the sequence till where we want fibonnaci series");
		int num=sc.nextInt();
		int c=0, a=0,b=1;
		System.out.println(a);
		System.out.println(b);
		for (int i=0;i<num-2;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}

	}

}
