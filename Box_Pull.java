package com.milon.CodeForces;

import java.util.Scanner;

public class Box_Pull {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int x1,y1,x2,y2;
            x1=sc.nextInt();
            y1=sc.nextInt();
            x2=sc.nextInt();
            y2=sc.nextInt();
            //int value=(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)))*(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));

            System.out.println(Solve(x1,y1,x2,y2));
        }
    }
    public static int Solve(int x1, int x2, int y1, int y2){
        if(x1==y1 && x2==y2){
            return 0;
        }
        if(x1==y1){
            return Math.abs(x2-y2);
        }
        if(x2==y2){
            return Math.abs(x1-y1);
        }
        int a=Math.abs(x1-y1);
        int b=Math.abs(x2-y2);
        if(a==1 && b==1){
            return 4;
        }
        else if(a==1){
            int s=2+b+1;
            return s;
        }
        else if(b==1){
            int s=2+a+1;
            return s;
        }
        else{
            int s=a+b+2;
            return s;
        }
    }
}
