package array.basic;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the inputs");

        String s = scan.nextLine();
        int i = scan.nextInt();
        scan.nextInt();
        double d = scan.nextDouble();


        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();

    }
}