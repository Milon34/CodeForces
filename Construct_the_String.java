package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Construct_the_String {
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
        RealScanner sc = new RealScanner();
        int t = sc.nextInt();
        String s ="abcdefghijklmnopqrstuvwxyz";
        String perfectStr="";
        for (int i=0;i<=2000;i++){
            char ch= (char) ((s.charAt(i%26)-'a')+97);
            perfectStr+=ch;
        }
       // System.out.println(perfectStr);
        while (t-- > 0) {
            int n, a, b;
            n = sc.nextInt();
            a = sc.nextInt();
            b = sc.nextInt();
            String sub = perfectStr.substring(0, n);
            //System.out.println(sub);
            int val = a - b;
            if (val == 0) {
                System.out.println(sub);
            } else {
                for (int i = 0; i < sub.length(); i++) {
                    System.out.print(sub.charAt(i%b));
//                    sub = sub.replace(sub.charAt(i), sub.charAt(i % b));
                }
                System.out.println();
//                System.out.println(sub);
            }
        }
    }
}
