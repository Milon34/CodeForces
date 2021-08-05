package Codeforces;

import java.util.Scanner;

public class Even_Substrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int count=0;
        for (int i=0;i<s.length();i++){
           if((s.charAt(i)-'0')%2==0){
               count+=i+1;
           }
        }
        System.out.println(count);
    }
}
