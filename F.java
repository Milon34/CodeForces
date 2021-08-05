package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class F {
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
    static int lower(long a[], long x) { // x is the target value or key
        int l = -1, r = a.length;
        while (l + 1 < r) {
            int m = (l + r) >>> 1;
            if (a[m] >= x) r = m;
            else l = m;
        }
        return r;
    }

    static long upperBound(long a[], long x) {
        long l = -1, r = a.length;
        while (l + 1 < r) {
            long m = (l + r) >>> 1;
            if (a[(int) m] <= x) l = m;
            else r = m;
        }
        return l + 1;
    }

    public static void main(String[] args) {
        RealScanner sc = new RealScanner();
        PrintWriter out=new PrintWriter(System.out);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {
            long n, l, r;
            n = sc.nextLong();
            l = sc.nextLong();
            r = sc.nextLong();
            long a[] = new long[(int) n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);
            long ct = 0;
            for (long i = 0; i < n; i++) {
                long pos1 = lower(a, l - a[(int) i]);
                long pos2 = upperBound(a, r - a[(int) i]);

                if (pos2 == n || a[(int) pos2] + a[(int) i] > r)
                    pos2--;
                ct += pos2 - pos1 + 1;
                if (pos1 <= i && i <= pos2)
                    ct--;

            }
            out.println(ct / 2);
        }
        out.flush();
        out.close();
    }
}
