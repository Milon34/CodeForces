package com.milon.CodeForces;

import java.util.Scanner;

public class BoringApartments {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while (t-- >0){
            int a;
             a=sc.nextInt();
            int len = 0;
            int temp = a;

           while (temp!=0){
               len++;
                temp=temp/10;
           }
            System.out.println((10 * ((a % 10) - 1)) + (len * (len + 1)) / 2);


//
//            if (a<10){
//                System.out.println(1);
//            }
//
//            if (a/10<10){
//
//                a=a/10;
//                if (a==2)
//                System.out.println(a1+b1+c1+d1);
//            }
//            if (a<10){
//                System.out.println(1);
//
//            }
//            System.out.println(value);
//
////            int count=0;
////           while (a!=0){
////                a=a/10;
////                count++;
////           }
////
////
////           if (a/10<10){
////               if ()
////               System.out.println();
////           }



        }
    }
}
