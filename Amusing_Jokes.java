package com.milon.CodeForces;

import java.util.Scanner;

/**
 * Created by Asus on 8/28/2020.
 */
public class Amusing_Jokes {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int b=0;
        int a=sc.nextInt();
        while (a-- >0){
            b=sc.nextInt();
        }
        if (b%2==1){
            System.out.println("TRUE");
        }
    }
}
