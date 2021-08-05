package Codeforces.Round_735_div2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B {
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
            long n, k;
            n = sc.nextLong();
            k = sc.nextLong();
            long[] arrValue = new long[(int) n];
            for (long i = 0; i < n; i++) {
                arrValue[(int) i] = sc.nextLong();
            }
            long max = -1000000000000L;
            for (long i = 0; i < n; i++) {
                max = Math.max(max, getValue(arrValue,i,k, Math.max(0L, i - k - 1L), Math.min(n - 1L, i + k + 1L)));
            }
            System.out.println(max);
        }
    }
    //Main
    static long getValue(long[] arrValue, long idxVal, long kVal, long m1, long m2) {
        long max = -1000000000000L;
        long coc;
        for (long i = m1; i <= m2; i++) {
            if (i == idxVal) {
                continue;
            }
            coc = ((i + 1) * (idxVal + 1)) - (kVal * (arrValue[(int) idxVal] | arrValue[(int) i]));
            max = Math.max(max, coc);
        }
        return max;
    }
//    static class RealScanner {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer("");
//
//        String next() {
//            while (!st.hasMoreTokens())
//                try {
//                    st = new StringTokenizer(br.readLine());
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            return st.nextToken();
//        }
//
//        int nextInt() {
//            return Integer.parseInt(next());
//        }
//
//        int[] readArray(int n) {
//            int[] a = new int[n];
//            for (int i = 0; i < n; i++) a[i] = nextInt();
//            return a;
//        }
//
//        long nextLong() {
//            return Long.parseLong(next());
//        }
//    }
}
