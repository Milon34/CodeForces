package Codeforces;

import java.util.Scanner;

public class Between_the_Offices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String s=sc.next();
        int count1=0,count2=0;
        for (int i=0;i<s.length()-1;i++){
            if (s.charAt(i)=='S'&&s.charAt(i+1)=='F'){
               count1++;
            }
            if (s.charAt(i)=='F'&&s.charAt(i+1)=='S'){
               count2++;
            }
        }
        if (count1>count2){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
