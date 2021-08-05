package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Contest_Start {
    public static void main(String[] args) {
        RealScanner sc=new RealScanner();
        int test=sc.nextInt();
        while (test-->0){
            long n,x,t,total;
            n=sc.nextLong();
            x=sc.nextLong();
            t=sc.nextLong();
            long val=Math.min(n-1,t/x);
            if (val==0){
                System.out.println(0);
                continue;
            }
             total=Math.max(0,((val*(val-1))/2)+val*(n-val));
            System.out.println(total);
        }
    }
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
    }
}
