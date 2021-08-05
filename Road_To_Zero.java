package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Road_To_Zero {
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
        while (t-- > 0) {
            long x, y, a, b;
            x = sc.nextLong();
            y = sc.nextLong();
            a = sc.nextLong();
            b = sc.nextLong();
            b = Math.min(b, 2 * a);
//            if (x < y) {
//                long temp = x;
//                x = y;
//                y = temp;
//            }
            long val=Math.min(x,y);
            System.out.println((val * b) + (Math.abs(x - y) * a));
        }
    }
}
