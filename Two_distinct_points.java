package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Two_distinct_points {
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
        RealScanner sc=new RealScanner();
        int t=sc.nextInt();
        while (t-->0){
            int a,b,c,d;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            d=sc.nextInt();
            if (Math.min(a,b)==Math.max(c,d)){
                System.out.println(Math.max(a,b)+" "+Math.min(c,d));
                continue;
            }
            if (Math.max(a,b)==Math.min(c,d)){
                System.out.println(Math.min(a, b) + " " + Math.max(c, d));
                continue;
            }
            System.out.println(Math.min(a, b) + " " + Math.max(c, d));
        }
    }
}
