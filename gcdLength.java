package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class gcdLength {
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

    static long gcdCal(long a, long b) {
        while (b > 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        RealScanner sc = new RealScanner();
        int n = sc.nextInt();
        while (n-- > 0) {
            long a, b, c;
            a = sc.nextLong();
            b = sc.nextLong();
            c = sc.nextLong();
            for (int i = 0; i <= a - c; i += 1) {
                System.out.print(1);
            }
            for (int i = 1; i < c; i += 1) {
                System.out.print(0);
            }
            System.out.print(" " + 1);
            for (int i = 1; i < b; i += 1) {
                System.out.print(0);
            }
            System.out.println();
        }
    }
}
