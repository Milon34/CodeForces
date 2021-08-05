package Codeforces;

import java.util.Scanner;

public class Stones {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a,b,c;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            int val=Math.min(b,c/2);
            b-=val;
            int val2=Math.min(a,b/2);
            System.out.println(3*(val+val2));
        }
    }
}
