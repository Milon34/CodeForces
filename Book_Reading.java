package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Book_Reading {
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
            long n, m;
            n = sc.nextLong();
            m = sc.nextLong();
            if (n < m) {
                System.out.println(0);
                continue;
            }
            String s = String.valueOf(m);
            long val = s.charAt(s.length() - 1) - '0';
            List<Long> l = new ArrayList<>();
            l.add(val);
            long i = 1;
            while (true) {
                long mVal = l.get((int) (i - 1)) + val;
                String pers = String.valueOf(mVal);
                long last = pers.charAt(pers.length() - 1) - '0';
                if (l.contains(last)) {
                    break;
                } else {
                    l.add(last);
                }
                i++;
            }
            System.out.println(l);
            long cons = 0;
            for (long p = 0; p < l.size(); p++) {
                cons += l.get((int) p);
            }
            long div = n / m;
            long sum = 0;
            for (long idx = 0; idx < div % l.size(); idx++) {
                sum += l.get((int) idx);
            }
            sum += (div / l.size()) * cons;
            System.out.println(sum);
        }
    }
}
