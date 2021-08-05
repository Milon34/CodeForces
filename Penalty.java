package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Vector;

public class Penalty {
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
    static boolean ch1(long s1, long s2, long r) {
        if (s1 + r < s2) {
            return true;
        }
        return false;
    }

    static boolean ch2(long s1, long s2, long r) {
        if (s2 + r < s1) {
            return true;
        }
        return false;
    }
    static long Solution(Vector<Long> arr) {
        long count1 = 0, count2 = 0;
        long res = 9;
        for (long i = 1; i < 10; i += 2) {
            count1 += arr.get((int) (i - 1));
            long rem = (10 - i - 1) / 2;
            rem++;
            if (ch2(count1, count2, rem) || ch1(count1, count2, rem - 1)) {
                res = i - 1;
                break;
            }
            count2 += arr.get((int) i);
            rem--;
            if (ch2(count1, count2, rem) || ch1(count1, count2, rem)) {
                res = i;
                break;
            }
        }
        return res + 1;
    }
    public static void main(String[] args) {
        RealScanner sc = new RealScanner();
        int t = sc.nextInt();
        while (t-- > 0) {
            String s;
            s = sc.next();
            Vector<Long> arr = new Vector<>();
            for (long i = 0; i < 10; i++) {
                if (s.charAt((int) i) == '?') {
                    if (i % 2 != 0) {
                        arr.add((int) i, 0L);
                    } else {
                        arr.add((int) i, 1L);
                    }
                } else if (s.charAt((int) i) == '1') {
                    arr.add((int) i, 1L);
                } else {
                    arr.add((int) i, 0L);
                }
            }
            Vector<Long> arr1 = new Vector<>();
            for (long i = 0; i < 10; i++) {
                if (s.charAt((int) i) == '?') {
                    if (i % 2 != 0) {
                        arr1.add((int) i, 1L);
                    } else {
                        arr1.add((int) i, 0L);
                    }
                } else if (s.charAt((int) i) == '1') {
                    arr1.add((int) i, 1L);
                } else {
                    arr1.add((int) i, 0L);
                }
            }
            System.out.println(Math.min(Solution(arr), Solution(arr1)));
        }
    }
}


