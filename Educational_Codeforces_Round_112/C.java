package Codeforces.Educational_Codeforces_Round_112;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class C {
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
            int n = sc.nextInt();
            int[] arr1 = new int[n + 1];
            int[] arr2 = new int[n + 1];
            int[] pre1 = new int[n + 1];
            int[] pre2 = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                arr1[i] = sc.nextInt();
            }
            for (int i = 1; i <= n; i++) {
                arr2[i] = sc.nextInt();
            }
            for (int i = 1; i <= n; i++) {
                pre1[i] = pre1[i - 1] + arr1[i];
            }
            for (int i = 1; i <= n; i++) {
                pre2[i] = pre2[i - 1] + arr2[i];
            }
           // System.out.println(Arrays.toString(pre1));
            //System.out.println(Arrays.toString(pre2));
            long res = pre1[n] - pre1[1];
            for (int i = 2; i <= n; i++) {
                res = Math.min(res, Math.max(pre2[i - 1], pre1[n] - pre1[i]));
            }
            System.out.println(res);
        }
    }
}
