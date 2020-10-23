package com.milon.CodeForces;

import java.util.Scanner;

/**
 * Created by Asus on 8/25/2020.
 */
public class String_Similarity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            boolean bool = false;
            int n = sc.nextInt();
            char[] s = sc.next().toCharArray();
            for (int i = 0; i < s.length; i+=2) {
                System.out.print(s[i]);
            }
            System.out.println();
        }
    }

}
