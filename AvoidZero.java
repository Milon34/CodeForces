package com.milon.CodeForces;

import java.util.Scanner;

public class AvoidZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for (int j=0;j<t;j++){
            int result=0;

            int a=sc.nextInt();
            int[] arr=new int[1001];
            for ( int i=0;i<a;i++){

                arr[i]=sc.nextInt();

                result=result+arr[i];
            }

            for (int i=0;i<a;i++){
                if ((arr[i]+arr[i+1])==0){

                }
            }
                if (result==0){
                System.out.println("NO");
            }else {

                System.out.println("YES");
                    for (int i=0;i<a;i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
            }

        }

    }
}
