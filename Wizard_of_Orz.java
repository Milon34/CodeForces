package Codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class Wizard_of_Orz {
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
        PrintStream out = new PrintStream(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = "989";
            if (n <= 3) {
                out.println(s.substring(0, n));
                continue;
            }
            out.print(s);
            for (int per = 3; per < n; per++) {
                out.print((per - 3) % 10);
            }
            out.println();

        }
        out.flush();
        out.close();
    }
}
