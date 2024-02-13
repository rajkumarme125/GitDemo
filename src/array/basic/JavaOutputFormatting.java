package array.basic;

import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        String s1=sc.next();
        int x=sc.nextInt();
        int l =10 - (s1.length());
        String bla ="";
        for(int i=0;i<l;i++){
            bla = bla + " ";
}
        System.out.println(s1+bla+ "03d %n"+ x);
        System.out.println("================================");

    }
}
