package com.milon.CodeForces;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        a=Math.min(a,b);
        if (a%2==0){
            System.out.println("Malvika");
        }else {
            System.out.println("Akshat");
        }
    }
}
