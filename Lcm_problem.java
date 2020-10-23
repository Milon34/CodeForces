package com.milon.CodeForces;

import java.util.Scanner;

public class Lcm_problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int r,s;
            r=sc.nextInt();
            s=sc.nextInt();
            if (r*2>s){
                System.out.println(-1+" "+ -1);
            }else {
                System.out.println(r+" "+r*2);
            }
        }
    }
}
