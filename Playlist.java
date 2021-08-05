package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Playlist {
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

    public static Long longest_Dis_length(long[] arr, long n) {
        HashMap<Long, Long> h = new HashMap<>();
        long res = 0;
        for (long i = 0, j = 0; i < n; i++) {
            try {
                j = Math.max(h.containsKey(arr[(int) i]) ? h.get(arr[(int) i]) : 1, j);
            } catch (Exception e) {
            }
            res = Math.max(res, i - j + 1);
            h.put(arr[(int) i], i + 1);
        }
        return res;
    }
    public static void main(String[] args) {
        RealScanner sc = new RealScanner();
        long n = sc.nextLong();
        long[] arr = new long[(int) n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        System.out.println(longest_Dis_length(arr, n));
    }
}
class testPriorityQueue{
    public static void main(String[] args) {
        PriorityQueue<Integer>p=new PriorityQueue<>(Collections.reverseOrder());
        p.add(1);
        p.add(5);
        p.add(4);
        p.add(3);
        p.add(2);
        p.add(9);
        System.out.println(p);
    }
}