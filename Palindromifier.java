package com.milon.CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Palindromifier {
    public static void main(String[] args) {
        RealScanner rs=new RealScanner();
       final String s=rs.next();
        int n = s.length();
        System.out.println(3);
        System.out.println("L 2");
        n += 1;
        System.out.println("R 2");
        n = (2*n - 1);
        System.out.println("R " + (n - 2));

    }


    static class RealScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        private String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        int[] readArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++){
                a[i]=nextInt();
            }
            return a;
        }

    }
}

