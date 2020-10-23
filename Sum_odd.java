package com.milon.CodeForces;

import java.util.Scanner;

public class Sum_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        while (t-- >0){
            long n,k;
            n=sc.nextLong();
            k=sc.nextLong();
            if (n / (k * k) == 0){
                System.out.println("NO");
            }else if ((n + k) % 2 == 1){
                System.out.println("NO");
            }else {
                System.out.println("YES");
            }

        }
    }
}
