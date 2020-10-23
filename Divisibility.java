package com.milon.CodeForces;

import java.util.Scanner;
public class Divisibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while (n-- >0){
            int a,b;
            a=sc.nextInt();
            b=sc.nextInt();
            if (a%b==0){
                System.out.println("0");
            }else {
                System.out.println(b-a%b);
            }
        }
    }
}
