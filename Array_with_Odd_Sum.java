package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array_with_Odd_Sum {
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
        long t = sc.nextLong();
        while (t-- > 0) {
            long n = sc.nextLong();
            long[] arr = new long[(int) n];
            long countEven = 0, countOdd = 0;
            for (long i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (a%2==0){
                    countEven++;
                }else {
                    countOdd++;
                }
            }
            if (countEven==n|| (n%2==0&&countOdd==n)) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }

        }
    }
}
