package com.milon.CodeForces;

import java.util.Scanner;


public class ApartmentsNo {
    public static void main(String[] args) {
        Scanner fs=new Scanner(System.in);
        int T=fs.nextInt();
        boolean[] possible=new boolean[1010];
        possible[0]=true;
        for (int i=0; i<1000; i++) {
            if (!possible[i]){
                continue;
            }
            possible[i+3]=possible[i+5]=possible[i+7]=true;
        }
        for (int a=0; a<T; a++) {
            int n=fs.nextInt();
            if (!possible[n]){
                System.out.println(-1);
            }
            else {
                int[] counts=new int[3];
                while (n!=0) {
                    if (possible[n-3]) {
                        counts[0]++;
                        n-=3;
                    }
                    else if (possible[n-5]) {
                        counts[1]++;
                        n-=5;
                    }
                    else {
                        counts[2]++;
                        n-=7;
                    }
                }
                System.out.println(counts[0]+" "+counts[1]+" "+counts[2]);
            }
        }
    }
    }

