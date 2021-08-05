package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Game2048_Game {
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
        int t = sc.nextInt();
        m:while (t-- > 0) {
            int n = sc.nextInt();
            long sum = 0;
            List<Integer> l = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                l.add(a);
                sum += a;
            }
            if (sum < 2048) {
                System.out.println("NO");
                continue;
            }
            if (l.contains(2048)) {
                System.out.println("YES");
                continue;
            }
         //   System.out.println(sum);
            List<Integer> lm = new ArrayList<>();
            long tot = 0;
            for (int i = 0; i < n; i++) {
                if (l.get(i) <= 2048) {
                    tot += l.get(i);
                }
            }
           // System.out.println(tot);
            if (tot >= 2048) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
