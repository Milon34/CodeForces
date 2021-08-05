package Codeforces;

import DS_ALGO.SegmentTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Maximum_SubArray_Sum {
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

    static long maxSubSum(long[] a, long len) {
        long let_max = a[0];
        long cur_max = a[0];
        for (int i = 1; i < len; i++) {
            cur_max = Math.max(a[i], cur_max + a[i]);
            let_max = Math.max(let_max, cur_max);
        }
        return let_max;
    }

    public static void main(String[] args) {
        RealScanner sc = new RealScanner();
        long n = sc.nextLong();
        long[] arr=new long[(int) n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        System.out.println(maxSubSum(arr,n));
    }
}
