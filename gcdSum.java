package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class gcdSum {
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

    static long gcdCal(long n1, long n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdCal(n2, n1 % n2);
    }

    public static void main(String[] args) {
        RealScanner sc = new RealScanner();
        long n = sc.nextLong();
        while (n-- > 0) {
            long m = sc.nextLong();
            long i = 0;
            for (long l = m; ; l++) {
                String s = String.valueOf(l);
                long len = s.length();
                long sum = 0,val=l;
                while (len-- > 0) {
                    sum += s.charAt((int) i) - 48;
                    i++;
                }
                //System.out.println(sum);
                i = 0;
                //System.out.println(sum);
                long gcd = gcdCal(l, sum);
//             while ((m%gcd!=0&&sum%gcd!=0)||gcd==1){
//                 m++;
//                 sum++;
//                 gcd=gcdCal(m,sum);
//             }
                // System.out.println(gcd);
                if (gcd != 1) {
                    System.out.println(l);
                    break;
                }
            }
        }
    }
}
