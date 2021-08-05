package Codeforces.GlobalRound15;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
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
            int n;
            n = sc.nextInt();
            List<List<Integer>> l = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                l.add(new ArrayList<>());
            }
            //  List<Integer> t = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 5; j++) {
                    int x;
                    x = sc.nextInt();
                    l.get(i).add(x);
                }
            }
            if (n == 1) {
                System.out.println(1);
                continue;
            }
            int idx = 0;
            for (int i = 1; i < n; i++) {    //Main Work running......
                int count = 0;
                for (int j = 0; j < 5; j++) {
                    if (l.get(i).get(j) < l.get(idx).get(j)) {
                        count++;
                    }
                }
                if (count >= 3) {
                    idx = i;
                }
               //System.out.println(count);
            }
            System.out.println("m:" + idx);
            boolean res = false;//check
            for (int i = 0; i < n; i++) {
                int count = 0;
                if (i != idx) {
                    for (int j = 0; j < 5; j++) {
                        if (l.get(idx).get(j)<l.get(i).get(j)) {
                            count++;
                        }
                    }
                    if (count< 3){
                        res = true;
                    }
                }
               // System.out.println(count);
            }
            if (!res) {
                System.out.println(idx + 1);
            } else {
                System.out.println(-1);
            }
        }
    }
}

