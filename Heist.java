package Codeforces;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Heist {
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
        int n = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            l.add(a);
        }
        Collections.sort(l);

            int sum=0;
            for (int i =1; i <n; i++) {
               sum+=l.get(i)-(l.get(i-1)+1);
            }
             System.out.println(sum);
            //System.out.println((l.get(1)-(l.get(0)+1))+(l.get(2)-(l.get(1)+1)));
        }
    }

