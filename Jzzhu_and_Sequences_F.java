package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Jzzhu_and_Sequences_F {
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
    static long MOD = 1000000007;
    public static void main(String[] args) {
        RealScanner sc = new RealScanner();
        long f1, f2;
        f1 = sc.nextLong();
        f2 = sc.nextLong();
        long n = sc.nextLong();
        long res = f2 - f1;
        List<Long> l = new ArrayList<>();
        l.add(f2);
        l.add(res);
        long k = 1;
        for (int i = 3; i < 8; i++) {
            l.add(l.get((int) k) - l.get((int) (k - 1)));
            k++;
        }
        l.remove(0);
        if (l.get((int) (n % 6)) <= 0) {
            System.out.println(Math.abs(l.get((int) (n % 6))) % MOD);
        } else {
            if ((MOD - l.get((int) (n % 6)) % MOD) == MOD) {
                System.out.println(0);
                return;
            }
            System.out.println(MOD - l.get((int) (n % 6)) % MOD);
        }
    }
}
