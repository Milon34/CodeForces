package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Avoid_Trygub {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            char[] ch=sc.next().toCharArray();
            Arrays.sort(ch);
            String s= String.valueOf(ch);
            System.out.println(s);
        }
    }
}
