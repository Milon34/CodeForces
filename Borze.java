package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Borze {
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
        String s = sc.next();
        String myS = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                myS += '0';
            }
            try {
                if (s.charAt(i) == '-') {
                    if (s.charAt(i + 1) == '.') {
                        myS += '1';
                        i++;
                    }
                   else if (s.charAt(i + 1) == '-') {
                        myS += '2';
                        i++;
                    }
                }
            } catch (Exception e) {

            }
        }
        System.out.println(myS);
    }
}
