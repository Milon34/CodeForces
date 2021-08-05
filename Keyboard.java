package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Keyboard {
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
        String or = sc.next();
        String s = sc.next();
        String myS = "";
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl;";
        String s3 = "zxcvbnm,./";
        if (or.equals("R")) {
            for (int i = 0; i < s.length(); i++) {
                String ch = String.valueOf(s.charAt(i));
                // int idx=s1.indexOf(ch);
                if (s1.contains(ch)) {
                    int idx = s1.indexOf(s.charAt(i));
                    myS += s1.charAt(idx - 1);
                }
                if (s2.contains(ch)) {
                    int idx = s2.indexOf(s.charAt(i));
                    myS += s2.charAt(idx - 1);
                }
                if (s3.contains(ch)) {
                    int idx = s3.indexOf(s.charAt(i));
                    myS += s3.charAt(idx - 1);
                }
            }
            System.out.println(myS);
        } else {
            for (int i = 0; i < s.length(); i++) {
                String ch = String.valueOf(s.charAt(i));
                // int idx=s1.indexOf(ch);
                if (s1.contains(ch)) {
                    int idx = s1.indexOf(s.charAt(i));
                    myS += s1.charAt(idx + 1);
                }
                if (s2.contains(ch)) {
                    int idx = s2.indexOf(s.charAt(i));
                    myS += s2.charAt(idx + 1);
                }
                if (s3.contains(ch)) {
                    int idx = s3.indexOf(s.charAt(i));
                    myS += s3.charAt(idx + 1);
                }
            }
            System.out.println(myS);
        }
    }
}
