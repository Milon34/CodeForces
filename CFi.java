package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CFi {
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
        //PrintWriter out=new PrintWriter(System.out);
        long n, k, x;
        n = sc.nextLong();
        k = sc.nextLong();
        x = sc.nextLong();
        long arr[] = new long[(int) n];
        for (long i = 0; i < n; i++) {
            arr[(int) i] = sc.nextLong();
        }
        Arrays.sort(arr);

        List<Long> l= new ArrayList<>();
        for (long i = 1; i < n; i++) {
            if (arr[(int) i] - arr[(int) (i - 1)] > x) {
                l.add(arr[(int) i] - arr[(int) (i - 1)]);
            }
        }
        long min = l.size() + 1;
        Collections.sort(l);

        for (long t : l) {
            long lm;
            if (t % x == 0) {
                lm = t / x;
                lm--;
            } else{
                lm = t/ x;
            }
            if (k >= lm) {
                min--;
                k -= lm;
            } else {
                break;
            }
        }
        System.out.println(min);
    }

}

