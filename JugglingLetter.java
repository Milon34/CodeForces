package com.milon.CodeForces;

import java.util.Scanner;

public class JugglingLetter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int a=sc.nextInt();
            for (int i=0;i<a;i++){
                String ch=sc.next();
               if (ch.equalsIgnoreCase(ch)){
                   System.out.println("YES");
               }else {
                   System.out.println("NO");
               }
          }
        }
    }
}
