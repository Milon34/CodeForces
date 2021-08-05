package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class AquaMoon_and_Two_Arrays {
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
    public static void main(String[] args) {
        RealScanner sc = new RealScanner();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> l1 = new ArrayList<>();
            List<Integer> l2 = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                l1.add(sc.nextInt());
            }
            for (int i = 0; i < n; i++) {
                l2.add(sc.nextInt());
            }

            List<Pair<Integer, Integer>> ans = new ArrayList<>();
            List<Pair<Integer, Integer>> l = new ArrayList<>();
            List<Pair<Integer, Integer>> r = new ArrayList<>();
            int s1 = 0, s2 = 0;
            for (int i = 0; i < n; i++) {
                if (l1.get(i) < l2.get(i)) {
                    l.add(new Pair<>(i, l2.get(i) - l1.get(i)));
                } else if (l1.get(i) > l2.get(i)) {
                    r.add(new Pair<>(i, l1.get(i) - l2.get(i)));
                }
                s1 += l1.get(i);
                s2 += l2.get(i);
            }
            if (s1 != s2) {
                System.out.println(-1);
                continue;
            }

            int x = 0;
            int y = 0;
            while (x < l.size() && y < r.size()) {
                int c = Math.min(l.get(x).second, r.get(y).second);
                for (int i = 0; i < c; i++) {
                    ans.add(new Pair<>(l.get(x).first, r.get(y).first));
                }
                l.get(x).second -= c;
                r.get(y).second -= c;
                if (l.get(x).second == 0) x++;
                if (r.get(y).second == 0) y++;
            }
            if (x == l.size() && y == r.size()) {
                System.out.println(ans.size());
                for (int i = 0; i < ans.size(); i++) {
                    System.out.println(ans.get(i).second + 1 + " " + (ans.get(i).first + 1));
                }
            } else {
                System.out.println(-1);
            }
        }
    }
}
