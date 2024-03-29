package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Brains_Photos {
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
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        String[][] s = new String[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                s[i][j] = sc.next();
            }
        }
        int count = 0;
        boolean check = true;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (s[i][j].equals("B") || s[i][j].equals("W") || s[i][j].equals("G")) {

                } else {
                    count++;
                    check = false;
                }
            }
        }
        if (count < 3&&check) {
            System.out.println("#Black&White");
        } else {
            System.out.println("#Color");
        }
    }
}
