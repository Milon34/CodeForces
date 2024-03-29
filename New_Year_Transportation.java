package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class New_Year_Transportation {
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
        int k = sc.nextInt();
        int[] arr = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        if (n == 1 && k == 1) {
            System.out.println("YES");
            return;
        } else if (n == 1 && k != 1) {
            System.out.println("NO");
        } else {
            for (int i = 0; i < n - 1;) {
                i += arr[i];
                if (i+1  == k) {
                    System.out.println("YES");
                    return;
                }
            }
            System.out.println("NO");
        }
    }
}
