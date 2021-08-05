package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Wet_Shark_and_Odd_and_Even {
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
    public static void main(String[] args) {
        RealScanner sc=new RealScanner();
        PrintWriter out=new PrintWriter(System.out);
        long n=sc.nextLong();
        long sum=0;
        List<Long> l=new ArrayList<>();
        for (long i=0;i<n;i++){
            long a=sc.nextLong();
            if (a%2!=0){
                l.add(a);
            }
            sum+=a;
        }
        if (sum%2==0){
            out.println(sum);
        }else {
            long min= Collections.min(l);
            System.out.println(sum-min);
        }
        out.flush();
        out.close();
    }
}
