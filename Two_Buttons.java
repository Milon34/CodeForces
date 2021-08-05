package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Two_Buttons {
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
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int count = 0;
        if (n > m) {
            System.out.println(n - m);
        } else {
            int val = m;
            while (val > n) {
                if (val % 2 == 0) {
                    val = val / 2;
                    count++;
                } else {
                    val++;
                    count++;
                }
            }
            System.out.println(count + (n - val));
        }

    }
}
