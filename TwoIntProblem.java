package com.milon.CodeForces;

import java.util.Scanner;

public class TwoIntProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int a,b;
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println((Math.abs(a-b)+9)/10);
        }
    }
}
