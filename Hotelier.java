package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;
import java.util.StringTokenizer;

public class Hotelier {
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
        int n = sc.nextInt();
        String s = sc.next();
        String myS = "0000000000";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                myS = myS.replaceFirst("0", "1");
            } else if (s.charAt(i) == 'R') {
                int idx = myS.lastIndexOf("0");
                myS = myS.substring(0, idx) + "1"+myS.substring(idx+1,myS.length());
            } else {
                int val = s.charAt(i) - '0';
                myS = myS.substring(0, val) + "0" + myS.substring(val + 1, myS.length());
            }
        }
        System.out.println(myS);
    }
}
