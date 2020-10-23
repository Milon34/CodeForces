package com.milon.CodeForces;

import java.util.Scanner;

/**
 * Created by Asus on 9/10/2020.
 */
public class SpitCamel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        int[] arr=new int[100];
        for ( i=0;i<n;i++){
            arr[i]=sc.nextInt();
            arr[i+1]=sc.nextInt();

        }
        if (arr[i]==arr[i+1]){
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }

    }
}
