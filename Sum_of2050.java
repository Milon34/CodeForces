package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Sum_of2050 {
    static class RealScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        public static final class Pair<T1, T2> {
            public T1 first;
            public T2 second;

            public Pair() {
                first = null;
                second = null;
            }

            public Pair(T1 firstValue, T2 secondValue) {
                first = firstValue;
                second = secondValue;
            }

            public Pair(Pair<T1, T2> pair) {
                first = pair.first;
                second = pair.second;
            }

        }
    }
    public static void main(String[] args) {
        RealScanner sc = new RealScanner();
        long t = sc.nextLong();
        while (t-- > 0) {
//            String s="205000000000000000";
            long n=sc.nextLong();
//            String myS=sc.next();
            if (n%2050!=0){
                System.out.println(-1);
                continue;
            }
            long res=0;
            long val=n/2050;
            String s= String.valueOf(val);
            for (int i=0;i<s.length();i++){
                res+=s.charAt(i)-'0';
            }
            System.out.println(res);
        }
    }
}
