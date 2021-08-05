package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Nastia_and_nearly_Good_Numbers {
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
        int test = sc.nextInt();
        while (test-- > 0) {
            long x, y;
            x = sc.nextLong();
            y = sc.nextLong();
            long per1, per2;
            if (y != 2) {
                per1 = (x * y);
                per2 = per1 - x;
            } else {
                per1 = (x * y) * 2;
                per2 = per1 - x;
            }
            if (y == 1) {
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");
            System.out.println(x + " " + per2 + " " + per1);
        }
    }
}
