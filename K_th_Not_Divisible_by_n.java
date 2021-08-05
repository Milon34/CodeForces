package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class K_th_Not_Divisible_by_n {
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
    static int nonDiv(int N, int K)
    {
        return (int) (K + Math.floor((double) (K - 1) / (N - 1)));
    }
    public static void main(String[] args) {
        RealScanner sc = new RealScanner();
        int t = sc.nextInt();
        while (t-- > 0) {
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(nonDiv(a,b));
//            int L = 1;
//            int H = Integer.MAX_VALUE;
//            int ans = 0;
//            while (L <= H) {
//                int mid = (L + H) / 2;
//
//                int sol = mid - mid / a;
//                if (sol > b) {
//                    H = mid - 1;
//                } else if (sol < b) {
//                    L = mid + 1;
//                } else {
//                    ans = mid;
//                    H = mid - 1;
//                }
//            }
//            System.out.println(ans);
        }
    }
}
