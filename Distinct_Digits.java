package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Distinct_Digits {
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
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
        for (int i=n;i<=k;i++){
            String s= String.valueOf(i);
            HashSet<Character> h=new HashSet<>();
            for (int j=0;j<s.length();j++){
                h.add(s.charAt(j));
            }
            if (h.size()==s.length()){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
