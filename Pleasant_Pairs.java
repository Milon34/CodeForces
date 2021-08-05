package Codeforces;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Pleasant_Pairs {
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
        PrintWriter out=new PrintWriter(System.out);
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            long[] arr = new long[2 * n + 1];
            for (int i = 0; i <= 2 * n; i++) {
                arr[i] = (long) 1e6;
            }
            System.out.println(Arrays.toString(arr));
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                arr[(int) a[i]] = i + 1;
            }
            long count = 0;
            for (int i = 3; i < 2 * n; i++) {
                for (int j = 1; j <= Math.sqrt(i); j++) {
                    if (i != j * j&&i % j == 0) {
                        if (arr[j] + arr[i / j] == i) {
                            count++;
                        }
                    }
                }
            }
           out.println(count);
        }
        out.flush();
        out.close();
    }
}
