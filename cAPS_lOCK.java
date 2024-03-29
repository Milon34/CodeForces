package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class cAPS_lOCK {
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
        boolean check = true;
        char ch;
        for (int i = 1; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                check = false;
            }
        }
        if (check) {
            for (int j = 0; j < s.length(); j++) {
                if (Character.isLowerCase(s.charAt(j))) {
                    ch = Character.toUpperCase(s.charAt(j));
                } else {
                    ch = Character.toLowerCase(s.charAt(j));
                }
                System.out.print(ch);
            }
        } else {
            System.out.print(s);
        }
    }
}

