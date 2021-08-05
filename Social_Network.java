package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class Social_Network {
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
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int k = sc.nextInt();
        LinkedList<Integer> s = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (s.size() > k) {
                s.pollLast();
            }
            if (!s.contains(a)) {
                s.addFirst(a);
            }
        }
        if (s.size() > k) {
            s.pollLast();
        }
        out.println(s.size());
        for (int i : s) {
            out.print(i + " ");
        }
        out.flush();
        out.close();
    }
}
