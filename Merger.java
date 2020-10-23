package com.milon.CodeForces;

import java.util.Scanner;

public class Merger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p,n,i,a;
        p=sc.nextInt();


        while (p-- >0){
            int[] x={0};
            int[] y={0};
            int d=0;
            int s=0;
            n=sc.nextInt();
            for (i=0;i<=2*n;i++){
                a=sc.nextInt();
                if (x[a-1]==0){
                    y[d++]=a;
                    x[a-1]=1;
                    s++;
                }
            }
            for (i=0;i<s;i++){
                System.out.println(y[i]);
            }
            System.out.println();
        }

    }
}
