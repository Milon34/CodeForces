package com.milon.CodeForces;

import java.util.Scanner;
public class Mul_Div_2or6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt();
            int count1=0,count2=0;
            while (n%2==0){
                n=n/2;
                count1++;

            }while (n%3==0){
                n=n/3;
                count2++;
            }
            if (n==1 && count1<=count2){
                System.out.println(2*count2-count1);
            }else {
                System.out.println(-1);
            }
        }
    }
}
