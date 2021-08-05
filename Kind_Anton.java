package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Kind_Anton {
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
        public static final class Pair<T1, T2> {
            public T1 first;
            public T2 second;

            public Pair() {
                first = null;
                second = null;
            }

            public Pair(T1 firstValue, T2 secondValue) {
                first = firstValue;
                second = secondValue;
            }

            public Pair(Pair<T1, T2> pair) {
                first = pair.first;
                second = pair.second;
            }

        }
    }
    public static void main(String[] args) {
        RealScanner sc = new RealScanner();
        int t = sc.nextInt();
        m:while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr1 = sc.readArray(n);
            int[] arr2 = sc.readArray(n);
            boolean add = false;
            boolean sub = false;
            for (int i = 0; i < n; i++) {
                if (arr1[i] < arr2[i]) {
                    if (!add) {
                        System.out.println("NO");
                        continue m;
                    }
                } else if (arr1[i] > arr2[i]) {
                    if (!sub) {
                        System.out.println("NO");
                        continue m;
                    }
                }
                if (arr1[i] == -1) {
                    sub = true;
                } else if (arr1[i] == 1) {
                    add = true;
                }
            }
            if (sub ||add|| Arrays.equals(arr1,arr2)) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
