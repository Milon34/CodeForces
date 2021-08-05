package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Putting_Plates {
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
        RealScanner sc = new RealScanner();//😶
        int t = sc.nextInt();
        while (t-- > 0) {
            long n, m;
            n = sc.nextInt();
            m = sc.nextInt();
            long[][] arr = new long[(int) n][(int) m];
            for (long i = 0; i < n; i++) {
                for (long j = 0; j < m; j++) {
                    arr[(int) i][(int) j] = 0;
                }
            }
            //check First
            arr[0][0] = 1;
            arr[(int) (n - 1)][0] = 1;
            arr[0][(int) (m - 1)] = 1;
            arr[(int) (n - 1)][(int) (m - 1)] = 1;
            if (n % 2 == 0) {
                for (int i = 3; i < n; i += 2) {
                    arr[i][0] = 1;
                    arr[i][(int) (m - 1)] = 1;
                }
            } else {
                for (int i = 2; i < n; i += 2) {
                    arr[i][0] = 1;
                    arr[i][(int) (m - 1)] = 1;
                }
            }
            if (m % 2 == 0) {
                for (int i = 3; i < m; i += 2) {
                    arr[0][i] = 1;
                    arr[(int) (n - 1)][i] = 1;
                }
            } else {
                for (int i = 2; i < m; i += 2) {
                    arr[0][i] = 1;
                    arr[(int) (n - 1)][i] = 1;
                }
            }
            //check last
            for (long i = 0; i < n; i++) {
                for (long j = 0; j < m; j++) {
                    System.out.print(arr[(int) i][(int) j]);
                }
                System.out.println();
            }
        }
    }
}
