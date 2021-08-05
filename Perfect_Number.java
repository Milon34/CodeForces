package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Perfect_Number {
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
        // List<Integer> l=new ArrayList<>();
        int inc=0;
        while (n!=0) {
            inc++;
            String s = String.valueOf(inc);
            int sum = 0;
            for (int j = 0; j < s.length(); j++) {
                int ch = s.charAt(j) - 48;
                sum += ch;
            }
            if (sum == 10) {
               n--;
            }
        }
        System.out.println(inc);
    }
    //System.out.println(l.size())
}

