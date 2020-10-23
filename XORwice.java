package com.milon.CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class XORwice {
    public static void main(String[] args) {
        RealScanner rs=new RealScanner();
        int t=rs.nextInt();
        while (t-- >0){
            Integer a,b;
            a=rs.nextInt();
            b=rs.nextInt();
            System.out.println(a^b);
        }
    }
    static void sort(int[] a) {
        ArrayList<Integer> l=new ArrayList<>();
        for (int i:a){
            l.add(i);
        }
        Collections.sort(l);
        for (int i=0; i<a.length; i++){
            a[i]=l.get(i);
        }
    }

//    static boolean Prime(int n){
//        final int H=50000;
//        for(int i = 2; i < Math.min(H, n); i++)
//            if(n % i == 0){
//                return false;
//            }
//        return true;
//    }

    static class RealScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        String next() {
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

