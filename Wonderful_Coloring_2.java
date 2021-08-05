package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Wonderful_Coloring_2 {
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
    public static java.util.ArrayList<Integer>[] init(int length) {
        java.util.ArrayList<Integer>[] array = new java.util.ArrayList[length];
        for (int i = 0; i < length; i++) {
            array[i] = new java.util.ArrayList<>();
        }
        return array;
    }
    public static <T> ArrayList<Long> initializedArrayList(long size, long value) {
        ArrayList<Long> temp = (ArrayList<Long>) new ArrayList<T>();
        for (long count = 1; count <= size; count++) {
            temp.add((long) value);
        }
        return temp;
    }
    public static void main(String[] args) {
        RealScanner sc = new RealScanner();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n, k;
            n = sc.nextInt();
            k = sc.nextInt();
            ArrayList<Integer>[] vx = init(n + 1);
            for (long i = 0; i < n; i++) {
                int x;
                x = sc.nextInt();
                vx[x].add((int) i);
            }
            ArrayList<Long> ans = initializedArrayList(n, -1);
            ArrayList<Long> ex = new ArrayList<>();
            for (long i = 1; i <= n; i++) {
                if (vx[(int) i].size() >= k) {
                    for (int j = 0; j < k; j++) {
                        ans.set(vx[(int) i].get(j), (long) j);
                    }
                } else {
                    for (long x : vx[(int) i]) {
                        ex.add((long) x);
                        if (ex.size() >= k) {
                            int id = 0;
                            for (long j : ex) {
                                ans.set(Math.toIntExact(j), (long) id++);
                            }
                            ex.clear();
                        }
                    }
                }
            }
            for (long i : ans) {
                System.out.print(i + 1);
                System.out.print(' ');
            }
            System.out.print("\n");
        }
    }
}

