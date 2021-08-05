package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ASol {
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
        RealScanner sc=new RealScanner();
        String s=sc.next();
        if (s.length()==1){
            System.out.println(s);
        }else {
            int k=0;
            for (long i = 0; i < s.length(); i++) {
                if (k==0&&s.charAt(0)=='9'){
                    System.out.print(s.charAt(0));
                    k++;
                }else {
                    System.out.print(Math.min(9 - ((long) s.charAt((int) i) - '0'), s.charAt((int) i) - '0'));
                }
            }
        }

    }
}
