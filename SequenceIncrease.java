package com.milon.CodeForces;

import java.util.Scanner;

public class SequenceIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=0,d=0;
        n=sc.nextLong();
        d=sc.nextLong();
        long current=-1;
        long total=0;

        for (int k=0;k<n;k++){
            long temp=0;
            temp=sc.nextLong();
            if (current<temp){
                current=temp;
            }else {
                long times=1+(current-temp)/d;
                current=temp+times*d;
                total=total+times;
            }
        }

        System.out.println(total);
    }
}
