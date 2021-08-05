package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boats_Competition {
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
        while (t-- > 0) {
            long n = sc.nextLong();
            Map<Long, Long> m = new HashMap<>();
            int[] arr = new int[(int) 105];
            for (int i = 1; i <= n; i++) {
                long a = sc.nextLong();
                arr[(int) a]++;
                m.put(a, m.getOrDefault(a, 0L) + 1);
            }
            System.out.println(Arrays.toString(arr));
            long min = 0, a, b;
            List<Long> l = new ArrayList<>();
            for (int i = 2; i <=2 * n; i++) {
                long res = 0;
                for (int j = 1; j <= n; j++) {
                    a = j;
                    b = i - a;
                    if (a >= i || b < a) {
                        break;
                    }
                    min = Math.min(arr[(int) a], arr[(int) b]);
                    if (a == b) {
                        min = arr[(int) a]/ 2;
                    }
                    res += min;
                }
                l.add(res);
            }
            System.out.println(l);
            System.out.println(Collections.max(l));
        }
    }
}
