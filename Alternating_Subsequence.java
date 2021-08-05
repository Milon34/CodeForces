package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Alternating_Subsequence {
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
            long n = sc.nextLong();
            List<Long> l = new ArrayList<>();
            for (long i = 0; i < n; i++) {
                long a = sc.nextLong();
                if (l.size() == 0) {
                    l.add(a);
                } else if (l.get(l.size() - 1) * a < 0) {
                    l.add(a);
                } else {
                    l.set(l.size() - 1, Math.max(a, l.get(l.size() - 1)));
                }
            }
            System.out.println(l);
            long sum = 0;
            for (long i = 0; i < l.size(); i++) {
                sum += l.get((int) i);
            }
            System.out.println(sum);
        }
    }
}
