package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Add_Odd_or_Subtract_Even {
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
        int n = sc.nextInt();
        while (n-- > 0) {
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            if (a < b) {
                int val = b - a;
                if (val % 2 != 0) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            }else if (a > b) {
                int val = a - b;
                if (val % 2 != 0) {
                    System.out.println(2);
                } else {
                    System.out.println(1);
                }
            } else {
                System.out.println(0);
            }
        }
    }
}
